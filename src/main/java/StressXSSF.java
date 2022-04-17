import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jxls.area.Area;
import org.jxls.builder.AreaBuilder;
import org.jxls.builder.xls.XlsCommentAreaBuilder;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiContext;
import org.jxls.transform.poi.PoiTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.List;

public class StressXSSF {
    public static final int EMPLOYEE_COUNT = 10;
    public static final int DEPARTMENT_COUNT = 100;
    public static final int DEP_EMPLOYEE_COUNT = 500;
    public static Logger logger = LoggerFactory.getLogger(StressXSSF.class);

    public void simpleSxssf() throws ParseException, IOException, InvalidFormatException {
        logger.info("running simple Sxssf demo");
        try (InputStream is = StressXSSF.class.getResourceAsStream("sxssf_template.xlsx")) {
            List<Employee> employees = Employee.generate(10);
            try (OutputStream os = new FileOutputStream("target/simple_sxssf_output.xlsx")) {
                Workbook workbook = WorkbookFactory.create(is);
                Transformer transformer = PoiTransformer.createSxssfTransformer(workbook, 5, false);
                AreaBuilder areaBuilder = new XlsCommentAreaBuilder(transformer);
                List<Area> xlsAreaList = areaBuilder.build();
                Area xlsArea = xlsAreaList.get(0);
                Context context = new Context();
//                context.putVar("cellRefUpdater", new CellRefUpdater());
                context.putVar("employees", employees);
                xlsArea.applyAt(new CellRef("Result!A1"), context);
                context.getConfig().setIsFormulaProcessingRequired(false); // with SXSSF you cannot use normal formula processing
                workbook.setForceFormulaRecalculation(true);
                workbook.setActiveSheet(1);
                ((PoiTransformer) transformer).getWorkbook().write(os);
            }
        }
    }

    public void executeStress1() throws IOException, InvalidFormatException {
        logger.info("Running Stress Sxssf demo 1");
        logger.info("Generating " + EMPLOYEE_COUNT + " employees..");
        List<Employee> employees = Employee.generate(EMPLOYEE_COUNT);
        logger.info("Created " + employees.size() + " employees");
        try (InputStream is = StressXSSF.class.getResourceAsStream("stress1_sxssf.xlsx")) {
            assert is != null;
            Workbook workbook = WorkbookFactory.create(is);
            Transformer transformer = PoiTransformer.createSxssfTransformer(workbook);
            AreaBuilder areaBuilder = new XlsCommentAreaBuilder(transformer);
            List<Area> xlsAreaList = areaBuilder.build();
            Area xlsArea = xlsAreaList.get(0);
            Context context = new PoiContext();
//            context.putVar("cellRefUpdater", new CellRefUpdater());
//            context.putVar("totalCellUpdater", new TotalCellUpdater());
            context.putVar("employees", employees);
            context.getConfig().setIsFormulaProcessingRequired(false);
            System.out.println("Start Update Cell");
            long startTime = System.nanoTime();
            xlsArea.applyAt(new CellRef("Sheet2!A1"), context);
            long endTime = System.nanoTime();
            System.out.println("Stress Sxssf demo 1 time (s): " + (endTime - startTime) / 1000000000);
            workbook.setForceFormulaRecalculation(true);
            workbook.setActiveSheet(1);
            try (OutputStream os = new FileOutputStream("target/sxssf_stress1_output.xlsx")) {
                ((PoiTransformer) transformer).getWorkbook().write(os);
            }
        }
    }

}

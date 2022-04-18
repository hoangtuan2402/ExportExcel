import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.io.util.UrlUtil;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.styledxmlparser.css.media.MediaDeviceDescription;
import com.itextpdf.styledxmlparser.css.media.MediaType;
import com.itextpdf.styledxmlparser.css.util.CssDimensionParsingUtils;

import java.io.FileInputStream;
import java.io.IOException;

public class C02E03_StarWars {
    public static final String DEST = "D:\\star_wars.pdf";
    public static final String SOURCE_FOLDER = "D:\\";
    public static final String DESTINATION_FOLDER = "D:\\";

    public static String BASEURI = "D:\\";
    public static String SRC = "D:\\upload2.html";

    public static void main(String args[]) {
//        createPdf2(DEST, BASEURI, SRC);
        try {
//            runTest("upload", new PageSize(1200, 1400));
            responsiveIText();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getHTML() {
        return "<html>\n" +
                "<body>\n" +
                "<h3 style=\"text-align: center; color: green\">\n" +
                "    <span>Welcome to Baeldung!</span>\n" +
                "</h3>\n" +
                "<div>\n" +
                "    <table id=\"employee\" class=\"table table-bordered\">\n" +
                "        <thead>\n" +
                "        <tr>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Name</th>\n" +
                "            <th>Email</th>\n" +
                "            <th>Mobile</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "            <th>Address</th>\n" +
                "\n" +
                "\n" +
                "        </tr>\n" +
                "        </thead>\n" +
                "        <tbody>\n" +
                "        <tr>\n" +
                "           \n" +
                "          \n" +
                "\n" +
                "        </tr>\n" +
                "        </tbody>\n" +
                "\n" +
                "    </table>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n";
    }

    public static void createPdf2(String dest, String baseUri, String src) throws IOException {
//        ConverterProperties properties = new ConverterProperties();
//        properties.setBaseUri(baseUri);
//        PdfWriter writer = new PdfWriter(dest);
//        PdfDocument pdf = new PdfDocument(writer);
//
////        PageSize ps = PageSize.A0;
////        ps.rotate();
////        pdf.setDefaultPageSize(ps);
//
////        HtmlConverter.convertToPdf(new FileInputStream(src), pdf, properties);
//        Document document =
//                HtmlConverter.convertToDocument(new FileInputStream(src), pdf, properties);
//        document.close();


        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        pdf.setTagged();
        PageSize pageSize = PageSize.A0.rotate();
        pdf.setDefaultPageSize(pageSize);
        ConverterProperties properties = new ConverterProperties();
        properties.setBaseUri(baseUri);
        MediaDeviceDescription mediaDeviceDescription
                = new MediaDeviceDescription(MediaType.SCREEN);
        mediaDeviceDescription.setWidth(pageSize.getWidth());
        properties.setMediaDeviceDescription(mediaDeviceDescription);
        HtmlConverter.convertToPdf(new FileInputStream(src), pdf, properties);

    }

    private static void runTest(String testName, PageSize pageSize) throws IOException, InterruptedException {
        PdfDocument pdfDocument = new PdfDocument(new PdfWriter(DESTINATION_FOLDER + testName + ".pdf"));
        if (null != pageSize) {
            pdfDocument.setDefaultPageSize(pageSize);
        }
        ConverterProperties properties = new ConverterProperties();
        properties.setBaseUri(SOURCE_FOLDER);
        MediaDeviceDescription mediaDeviceDescription
                = new MediaDeviceDescription(MediaType.SCREEN);
        mediaDeviceDescription.setWidth(pageSize.getWidth());
        properties.setMediaDeviceDescription(mediaDeviceDescription);
        HtmlConverter.convertToPdf(new FileInputStream(SOURCE_FOLDER + testName + ".html"), pdfDocument,
                properties);
        System.out.println("html: " + UrlUtil.getNormalizedFileUriString(SOURCE_FOLDER + testName + ".html") + "\n");

    }

    public static void responsiveIText() throws IOException, InterruptedException {
        PageSize[] pageSizes = {
//                null,
                new PageSize(5384.0F, 5384.0F),
//                new PageSize(760,PageSize.A4.getHeight()),
//                new PageSize(PageSize.A5.getWidth(), PageSize.A4.getHeight())
        };

        String htmlSource = SOURCE_FOLDER + "responsiveIText.html";

        for (PageSize pageSize : pageSizes) {
            Float pxWidth = null;
            if (pageSize != null) {
                pxWidth = CssDimensionParsingUtils.parseAbsoluteLength(String.valueOf(pageSize.getWidth()));
            }
            String outName = "responsiveIText" + (pxWidth != null ? "_" + (int) (float) pxWidth : "") + ".pdf";
            PdfWriter writer = new PdfWriter(DESTINATION_FOLDER + outName);
            PdfDocument pdfDoc = new PdfDocument(writer);
            ConverterProperties converterProperties = new ConverterProperties();
            if (pageSize != null) {
                pdfDoc.setDefaultPageSize(pageSize);
                MediaDeviceDescription mediaDescription = new MediaDeviceDescription(MediaType.SCREEN);
                mediaDescription.setWidth((float) pxWidth);
                converterProperties.setMediaDeviceDescription(mediaDescription);
            }
            try (FileInputStream fileInputStream = new FileInputStream(htmlSource)) {
                HtmlConverter.convertToPdf(fileInputStream, pdfDoc, converterProperties);
            }
            pdfDoc.close();
        }

        for (PageSize pageSize : pageSizes) {
            Float pxWidth = null;
            if (pageSize != null) {
                pxWidth = CssDimensionParsingUtils.parseAbsoluteLength(String.valueOf(pageSize.getWidth()));
            }
            String outName = "responsiveIText" + (pxWidth != null ? "_" + (int) (float) pxWidth : "") + ".pdf";
            System.out.println(outName);
        }
    }

    public void createPdf(String dest, String baseUri, String src) throws IOException {
        String html = getHTML();
//        //Initialize PDF document
        PdfWriter pdfWriter = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(pdfWriter);
//
//        //Add new page
        PageSize ps = PageSize.A0;
        ps.rotate();
        pdf.setDefaultPageSize(ps);

//
//
//        //Close document
//        pdf.close();


        ConverterProperties properties = new ConverterProperties();
        properties.setBaseUri(baseUri);

        Document document =
                HtmlConverter.convertToDocument(new FileInputStream(src), pdf, properties);
        document.close();
    }
}

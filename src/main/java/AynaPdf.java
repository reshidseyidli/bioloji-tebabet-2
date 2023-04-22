import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;

import java.io.IOException;

public class AynaPdf {

    public void createPdf(Entity entity) throws IOException {
        String pdfPath = "ayna.pdf";
        PdfWriter pdfWriter = new PdfWriter(pdfPath);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        PageSize pageSize = PageSize.A5;
        PdfPage page = pdfDocument.addNewPage(pageSize);

        // Add the dot to the page
        PdfCanvas canvas = new PdfCanvas(page);
        String fontPath = "fonts/roboto-regular.ttf";
        PdfFont font = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H);
        canvas.setFontAndSize(font, 9);


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //№
        canvas.beginText().setTextMatrix(190, 354.33f).showText("nömrə - üöğıəçş ÜÖĞIƏÇŞ").endText();

        //Seriyası və nömrəsi üst
        canvas.beginText().setTextMatrix(87.87f, 303.30f).showText("seriya üst").endText();

        //Seriyası və nömrəsi alt
        canvas.beginText().setTextMatrix(87.87f, 280.67f).showText("seriya alt").endText();

        //Markası
        canvas.beginText().setTextMatrix(274.96f, 300.47f).showText("markası").endText();

        //Növü
        canvas.beginText().setTextMatrix(260.79f, 272.12f).showText("növü").endText();

        //Qüvvədə olma müddəti - FROM GÜN
        canvas.beginText().setTextMatrix(90.71f, 252.28f).showText("dd").endText();

        //Qüvvədə olma müddəti - FROM AY
        canvas.beginText().setTextMatrix(110.55f, 252.28f).showText("mm").endText();

        //Qüvvədə olma müddəti - FROM IL
        canvas.beginText().setTextMatrix(147.40f, 252.28f).showText("yy").endText();

        //Qüvvədə olma müddəti - TO GUN
        canvas.beginText().setTextMatrix(90.71f, 232.44f).showText("dd").endText();

        //Qüvvədə olma müddəti - TO AY
        canvas.beginText().setTextMatrix(110.55f, 232.44f).showText("mm").endText();

        //Qüvvədə olma müddəti - TO IL
        canvas.beginText().setTextMatrix(147.40f, 232.44f).showText("yy").endText();

        //DQN - dövlət qeydiyyat nişanı
        canvas.beginText().setTextMatrix(331.65f, 239.11f).showText("DQN").endText();

        //Operator üst
        canvas.beginText().setTextMatrix(87.87f, 201.26f).showText("operator üst").endText();

        //Operator alt
        canvas.beginText().setTextMatrix(87.87f, 181.42f).showText("operator alt").endText();

        //Daşımanın növü
        canvas.beginText().setTextMatrix(235.28f, 181.42f).showText("daşımanın növü").endText();

        //Qüvvədə olma müddəti - FROM GUN
        canvas.beginText().setTextMatrix(90.71f, 99.21f).showText("dd").endText();

        //Qüvvədə olma müddəti - FROM AY
        canvas.beginText().setTextMatrix(110.55f, 99.21f).showText("mm").endText();

        //Qüvvədə olma müddəti - FROM IL
        canvas.beginText().setTextMatrix(147.40f, 99.21f).showText("yy").endText();

        //Qüvvədə olma müddəti - TO GUN
        canvas.beginText().setTextMatrix(90.71f, 79.37f).showText("dd").endText();

        //Qüvvədə olma müddəti - TO AY
        canvas.beginText().setTextMatrix(110.55f, 79.37f).showText("mm").endText();

        //Qüvvədə olma müddəti - TO IL
        canvas.beginText().setTextMatrix(147.40f, 79.37f).showText("yy").endText();

        //Bu sənəd gücləndirilmiş elektron imza ilə... ust
        canvas.beginText().setTextMatrix(235.28f, 85.04f).showText("bu sənəd üst").endText();

        //Bu sənəd gücləndirilmiş elektron imza ilə... - alt
        canvas.beginText().setTextMatrix(235.28f, 68.03f).showText("bu sənəd alt").endText();


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////


        Document document = new Document(pdfDocument);
        pdfDocument.close();
        document.close();
        pdfDocument.close();
        pdfWriter.close();
        System.out.println("PDF created");
    }

}

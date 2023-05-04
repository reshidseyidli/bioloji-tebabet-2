import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.font.otf.GlyphLine;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;

import java.io.IOException;

public class AynaAccessCardPdf {

    public static void main(String[] args) throws IOException {
        createPdf();
    }

    private static PdfCanvas canvas;
    private static final float CHAR_LENGTH = 3.7f;
    private static float center;
    private static float centerilizedStartPoint;

    private static void createPdf() throws IOException {
        String pdfPath = "ayna-card.pdf";
        PdfWriter pdfWriter = new PdfWriter(pdfPath);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        PageSize pageSize = PageSize.A5; //A5 size in pixels at 72 DPI: 420 x 595 pixels.
        PdfPage page = pdfDocument.addNewPage(pageSize);

        canvas = new PdfCanvas(page);
        String fontPath = "fonts/roboto-regular.ttf";
        PdfFont font = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H);
        canvas.setFontAndSize(font, 8);


        /**************************************************************************************************************/


        //№
        String no = "Əə İi Iı Şş Çç Öö Ğğ Üü";
        setText(no, 190f, 238.11f, 357.16f); //x = mm,  y = 125mm +1


        /**************************************************************************************************************/


        /**
         **                               Buraxılış vəsiqəsi / Access card
         **/


        //Seriyası və nömrəsi üst
        String seriyaUst = "seriya üst";
        setText(seriyaUst, 87.87f, 226.77f, 303.30f); //x = mm,  y = 106mm +1


        //////////////////////////////////////////////////////////////////////////


        //Seriyası və nömrəsi alt
        String seriyaAlt = "seriya alt";
        setText(seriyaAlt, 87.87f, 226.77f, 283.46f);  //x = mm,  y = 99mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM GÜN
        String ddFromUst = "dd";
        setText(ddFromUst, 90.71f, 107.71f, 252.28f); //x = mm,  y = 88mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM AY
        String mmFromUst = "mm";
        setText(mmFromUst, 110.55f, 133.22f, 252.28f); //x = mm,  y = 88mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM IL
        String yyFromUst = "yy";
        setText(yyFromUst, 147.40f, 161.57f, 252.28f); //x = mm,  y = 88mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO GUN
        String ddTo = "dd";
        setText(ddTo, 90.71f, 107.71f, 232.44f); //x = mm,  y = 81mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO AY
        String mmTo = "mm";
        setText(mmTo, 110.55f, 133.22f, 232.44f); //x = mm,  y = 81mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO IL
        String yyTo = "yy";
        setText(yyTo, 147.40f, 161.57f, 232.44f); //x = mm,  y = 81mm +1


        //////////////////////////////////////////////////////////////////////////


        //Operator üst
        String operatorUst = "operator üst";
        setText(operatorUst, 87.87f, 226.77f, 201.25f); //x = mm,  y = 70+mm +1


        //////////////////////////////////////////////////////////////////////////


        //Operator alt
        String operatorAlt = "operator alt";
        setText(operatorAlt, 87.87f, 226.77f, 184.25f); //x = mm,  y = 64mm +1


        /**************************************************************************************************************/


        /**
         **                               Avtonəqliyyat vasitəsi / Motor vehicle
         **/


        //Markası
        String marka = "markası";
        setText(marka, 274.96f, 382.68f, 303.30f); //x = mm,  y = 106mm +1


        //////////////////////////////////////////////////////////////////////////


        //Növü
        String novu = "növü";
        setText(novu, 260.79f, 382.68f, 272.12f); //x = mm,  y = 95+mm +1


        //////////////////////////////////////////////////////////////////////////


        //DQN - dövlət qeydiyyat nişanı
        String dqn = "DQN";
        setText(dqn, 331.65f, 382.67f, 240.94f); //x = mm,  y = 84+mm +1


        //////////////////////////////////////////////////////////////////////////


        //Daşımanın növü
        String dasinmaNovu = "daşımanın növü";
        setText(dasinmaNovu, 235.28f, 382.67f, 181.41f); //x = mm,  y = 63+mm +1


        /**************************************************************************************************************/


        /**
         **                               Buraxılış kartı / Access card
         **/


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM GÜN
        String ddFromAlt = "dd";
        setText(ddFromAlt, 90.71f, 107.71f, 102.04f); //x = mm,  y = 35+mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM AY
        String mmFromAlt = "mm";
        setText(mmFromAlt, 110.55f, 133.22f, 102.04f); //x = mm,  y = 35+mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM IL
        String yyFromAlt = "yy";
        setText(yyFromAlt, 147.40f, 161.57f, 102.04f); //x = mm,  y = 35+mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO GUN
        String ddToAlt = "dd";
        setText(ddToAlt, 90.71f, 107.71f, 82.20f); //x = mm,  y = 28mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO AY
        String mmToAlt = "mm";
        setText(mmToAlt, 110.55f, 133.22f, 82.20f); //x = mm,  y = 28mm +1


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO IL
        String yyToAlt = "yy";
        setText(yyToAlt, 147.40f, 161.57f, 82.20f); //x = mm,  y = 28mm +1


        //////////////////////////////////////////////////////////////////////////


        //Bu sənəd gücləndirilmiş elektron imza ilə... ust
        String buSenedUst = "bu sənəd üst";
        setText(buSenedUst, 235.28f, 382.67f, 87.87f); //x = mm,  y = 30mm +1


        //////////////////////////////////////////////////////////////////////////


        //Bu sənəd gücləndirilmiş elektron imza ilə... - alt
        String buSenedAlt = "bu sənəd alt";
        setText(buSenedAlt, 235.28f, 382.67f, 76.53f); //x = mm,  y = 26+mm +1


        /**************************************************************************************************************/


        Document document = new Document(pdfDocument);
        pdfDocument.close();
        document.close();
        pdfDocument.close();
        pdfWriter.close();
        System.out.println("PDF created");
    }

    private static void setText(String text, float x_axis_start, float x_axis_end, float y_axis) {
        center = ((x_axis_end - x_axis_start) / 2) + x_axis_start;
        centerilizedStartPoint = calculateStartPoint(center, text.length());
        canvas.beginText().setTextMatrix(centerilizedStartPoint, y_axis).showText(text).endText();
    }

    // for CENTERing content
    private static float calculateStartPoint(float x_center_point, int textLength) {
        return x_center_point - ((float) textLength / 2 * CHAR_LENGTH);
    }

}

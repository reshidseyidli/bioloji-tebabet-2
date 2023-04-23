import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;
import com.itextpdf.kernel.colors.ColorConstants;

import java.io.IOException;

public class AynaPdf {

    private static PdfCanvas canvas;
    private static final float CHAR_LENGTH = 3.7f;
    private static float center;
    private static float centerilizedStartPoint;

    public void createPdf(Entity entity) throws IOException {
        String pdfPath = "ayna.pdf";
        PdfWriter pdfWriter = new PdfWriter(pdfPath);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        PageSize pageSize = PageSize.A5; //A5 size in pixels at 72 DPI: 420 x 595 pixels.
        PdfPage page = pdfDocument.addNewPage(pageSize);

        // Add the dot to the page
        canvas = new PdfCanvas(page);
        String fontPath = "fonts/roboto-regular.ttf";
        PdfFont font = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H);
        canvas.setFontAndSize(font, 8);


        /**************************************************************************************************************/

        //№
        String strNo = "qwertyuiop";
        setText(strNo, 190f, 238.11f, 358.33f);


        /**************************************************************************************************************/


        /**
         **                               Buraxılış vəsiqəsi / Access card
         **/

        //Seriyası və nömrəsi üst
        String strSeriyaUst = "seriya üst";
        setText(strSeriyaUst, 87.87f, 226.77f, 305.30f);


        //////////////////////////////////////////////////////////////////////////


        //Seriyası və nömrəsi alt
        String seriyaAlt = "seriya alt";
        setText(seriyaAlt, 87.87f, 226.77f, 285.46f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM GÜN
        String ddFrom = "dd";
        setText(ddFrom, 90.71f, 107.71f, 255.28f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM AY
        String mmFrom = "mm";
        setText(mmFrom, 110.55f, 133.22f, 255.28f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM IL
        String yyFrom = "yy";
        setText(yyFrom, 147.40f, 161.57f, 255.28f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO GUN
        String ddTo = "dd";
        setText(ddTo, 90.71f, 107.71f, 235.44f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO AY
        String mmTo = "mm";
        setText(mmTo, 110.55f, 133.22f, 235.44f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO IL
        String yyTo = "yy";
        setText(yyTo, 147.40f, 161.57f, 235.44f);


        //////////////////////////////////////////////////////////////////////////


        //Operator üst
        String operatorUst = "operator üst";
        setText(operatorUst, 87.87f, 226.77f, 204.26f);


        //////////////////////////////////////////////////////////////////////////


        //Operator alt
        String operatorAlt = "operator alt";
        setText(operatorAlt, 87.87f, 226.77f, 184.42f);


        /**************************************************************************************************************/


        /**
         **                               Avtonəqliyyat vasitəsi / Motor vehicle
         **/


        //Markası
        String marka = "markasi";
        setText(marka, 274.96f, 382.68f, 306f);


        //////////////////////////////////////////////////////////////////////////


        //Növü
        String novu = "novu";
        setText(novu, 260.79f, 382.68f, 276.12f);


        //////////////////////////////////////////////////////////////////////////


        //DQN - dövlət qeydiyyat nişanı
        String dqn = "DQN";
        setText(dqn, 331.65f, 382.67f, 244.11f);


        //////////////////////////////////////////////////////////////////////////


        //Daşımanın növü
        String dasinmaNovu = "daşımanın növü";
        setText(dasinmaNovu, 235.28f, 382.67f, 184.42f);


        /**************************************************************************************************************/


        /**
         **                               Buraxılış kartı / Access card
         **/


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM GÜN
        String ddFromAlt = "dd";
        setText(ddFromAlt, 90.71f, 107.71f, 103.21f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM AY
        String mmFromAlt = "mm";
        setText(mmFromAlt, 110.55f, 133.22f, 103.21f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - FROM IL
        String yyFromAlt = "yy";
        setText(yyFromAlt, 147.40f, 161.57f, 103.21f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO GUN
        String ddToAlt = "dd";
        setText(ddToAlt, 90.71f, 107.71f, 83.37f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO AY
        String mmToAlt = "mm";
        setText(mmToAlt, 110.55f, 133.22f, 83.37f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədə olma müddəti - TO IL
        String yyToAlt = "yy";
        setText(yyToAlt, 147.40f, 161.57f, 83.37f);


        //////////////////////////////////////////////////////////////////////////


        //Bu sənəd gücləndirilmiş elektron imza ilə... ust
        String buSenedUst = "bu sənəd üst";
        setText(buSenedUst, 235.28f, 382.67f, 90.04f);


        //////////////////////////////////////////////////////////////////////////


        //Bu sənəd gücləndirilmiş elektron imza ilə... - alt
        String buSenedAlt = "bu sənəd alt";
        setText(buSenedAlt, 235.28f, 382.67f, 73.03f);


        /**************************************************************************************************************/


        Document document = new Document(pdfDocument);
        pdfDocument.close();
        document.close();
        pdfDocument.close();
        pdfWriter.close();
        System.out.println("PDF created");
    }

    private void setText(String text, float x_axis_start, float x_axis_end, float y_axis) {
        center = ((x_axis_end - x_axis_start) / 2) + x_axis_start;
        centerilizedStartPoint = calculateStatPoint(center, text.length());
        canvas.beginText().setTextMatrix(centerilizedStartPoint, y_axis).showText(text).endText();
    }

    // for CENTERing contetn
    private float calculateStatPoint(float x_center_point, int length) {
        return x_center_point - ((float) length / 2 * CHAR_LENGTH);
    }

}

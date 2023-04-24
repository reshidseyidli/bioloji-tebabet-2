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

public class AynaAccessCertificatePdf {

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

        canvas = new PdfCanvas(page);
        String fontPath = "fonts/roboto-regular.ttf";
        PdfFont font = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H);
        canvas.setFontAndSize(font, 8);


        //////////////////////////////////////////////////////////////////////////


        //Seriya
        String seriya = "seriya";
        setText(seriya, 85.04f, 130.39f, 362.83f);

        //////////////////////////////////////////////////////////////////////////


        //№
        String no = "nooooooooooo";
        setText(no, 141.73f, 188f, 362.83f);


        //////////////////////////////////////////////////////////////////////////


        //Verildiyi tarix GÜN
        String gun = "dd";
        setText(gun, 255.19f, 274.96f, 362.83f);


        //////////////////////////////////////////////////////////////////////////


        //Verildiyi tarix AY
        String ay = "dekabr";
        setText(ay, 283.46f, 340.16f, 362.83f);


        //////////////////////////////////////////////////////////////////////////


        //Verildiyi tarix IL
        String il = "22";
        setText(il, 354.33f, 379.84f, 362.83f);


        //////////////////////////////////////////////////////////////////////////


        //Operator
        String operator = "operator";
        setText(operator, 223.94f, 379.84f, 317.48f);


        //////////////////////////////////////////////////////////////////////////


        // (sərnişin, yük, yaxud hər ikisi)
        String sernisin = "sərnişin, yük, yaxud hər ikisi";
        setText(sernisin, 31.18f, 379.84f, 294.80f);


        //////////////////////////////////////////////////////////////////////////


        // (hüquqi şəxsin, xarici hüquqi şəxsin filialının, nümayəndəliyinin adı və hüquqi ünvanı fiziki şəxsin soyadı, adı,)
        String unvanAd = "hüquqi şəxsin, xarici hüquqi şəxsin filialının, nümayəndəliyinin";
        setText(unvanAd, 31.18f, 379.84f, 272.12f);


        //////////////////////////////////////////////////////////////////////////


        // (atasının adı vəfəaliyyət ünvanı, VÖEN)
        String voen = "atasının adı vəfəaliyyət ünvanı, VÖEN";
        setText(voen, 31.18f, 379.84f, 249.44f);


        //////////////////////////////////////////////////////////////////////////


        // (of foreign legal entity, surname, name ... )
        String tin = "of foreign legal entity, surname, name ... ";
        setText(tin, 31.18f, 379.84f, 226.77f);


        //////////////////////////////////////////////////////////////////////////


        // Qüvvədədir / Valid
        String quvvededir = "50";
        setText(quvvededir, 104.88f, 141.73f, 192.75f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədədir GÜN
        String quvveGun = "dd";
        setText(gun, 76.53f, 96.37f, 175.74f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədədir AY
        String quvveAy = "yanvar";
        setText(quvveAy, 102.04f, 187.08f, 175.74f);


        //////////////////////////////////////////////////////////////////////////


        //Qüvvədədir IL
        String quvveIl = "22";
        setText(quvveIl, 198.42f, 221.10f, 175.74f);


        //////////////////////////////////////////////////////////////////////////


        //İmzalayan vəzifəli şəxs (adı, soyadı və atasının adı)
        String imzalayan = "Resid Seyidli";
        setText(imzalayan, 155.9055f, 379.84f, 113.38f);


        //////////////////////////////////////////////////////////////////////////


        //Vəzifə
        String vezife = "proqram teminati";
        setText(vezife, 96.37f, 379.84f, 65.19f);


        //////////////////////////////////////////////////////////////////////////





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

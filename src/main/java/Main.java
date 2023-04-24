import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        MexaricPdf mexaricPdf = new MexaricPdf();
        Entity entity = new Entity();
//        entity.setBTKM("BTKM");
//        entity.setM0374("M0374");
//        entity.setKimden("Ad Soyad Ata adi");
//        entity.setNeUcun("ne ucun mezmunu.....");
//        entity.setMebleg(99.99f);
//        mexaricPdf.createMexaricPdf(entity);



//        AynaAccessCardPdf aynaAccessCardPdf = new AynaAccessCardPdf();
//        aynaAccessCardPdf.createPdf(entity);

        AynaAccessCertificatePdf certificatePdf = new AynaAccessCertificatePdf();
        certificatePdf.createPdf(entity);


    }
}

package pro.javacard.gp;

import java.io.IOException;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.encoders.Hex;

/**
 * Created by pim on 31/03/2017.
 */
public class GPDataTest {

  public void main(java.lang.String[] args) throws IOException {
    byte[] data = Hex.decode("640b06092a864886fc6b04");
    int offset = 0;
    String oid = ASN1ObjectIdentifier.fromByteArray(TLVUtils.getTLVValueAsBytes(data, offset)).toString();
    System.out.println("OID: " + oid);

  }

}
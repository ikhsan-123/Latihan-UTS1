import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utsikhsan {
    public static void main(String[] args) {


for(int angka = 1;
    angka<5001;angka++){
               String status;
               if(angka % 2==0) {
                   status = "valid";
               }else{
                   status="invallid";

               }
        System.out.println(angka+ "plat mobil tersebut"+status);

    }
}
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(" 34 67 103 = ");
//        String[] p_ = reader.readLine().split("34 67 103");
//        int _c = Integer.parseInt(p_[0]);
//        int _n = Integer.parseInt(p_[1]);
//        int _z = Integer.parseInt(p_[2]);
//        boolean _bool;
//        if (_c + _n + _z > 100) {
//            _bool = false;
//            if (_bool = true) ;
//            System.out.println("You are not authorized. . . ");
//        } else if (_bool = false) {
//            int h_ = 0;
//            for (int index = 0; index < 5; index++) {
//                h_ = _c + _n - _z + h_;
//            }
//            System.out.println("Total number is = " + h_);
//        }else{
//            System.out.println("Contact your administrator. . . ");
//    }
//
//    }




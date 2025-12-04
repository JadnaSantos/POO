package tech.buildrun.enums;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static void main(String[] args) {


//        System.out.println(Arrays.toString(NivelAcesso.values()))
//        System.out.println(NivelAcesso.ADMIN.getDescription());

          Usuario userA = new Usuario(
                  "Jadna",
                  NivelAcesso.ADMIN,
                  "jadna.teste@gmaio.com"
          );


          userA.mostarInfo();

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gustavo Cruz
 */

public class Teste {

    public static void main(String args[]) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();

        AdapterTomada a = new AdapterTomada(t3);
        a.ligarNaTomadaDeDoisPinos();
    }

}

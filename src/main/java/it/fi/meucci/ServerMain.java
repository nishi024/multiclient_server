package it.fi.meucci;

public class ServerMain {

  public static void main(String args[]) {
    ServerStr servente = new ServerStr();
    for (;;) {
      servente.attendi();
      servente.comunica();
    }
  }
}

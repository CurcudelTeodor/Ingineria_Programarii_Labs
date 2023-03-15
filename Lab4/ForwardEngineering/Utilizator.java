import java.util.Vector;
import java.util.List;
public class Utilizator extends Persoana {

  public String nume;

  public String prenume;

  public String dataNastere;

  public List<Utilizator> prieteni;

    public Vector  myAdmin;
    public Vector  myPagina;
    public Vector  myGroupMessenger;
    public Vector  myParserMesaj;

  public void creeazaCont(String username, String parola) {
  }

  public Utilizator cautaUtilizator(String username, String parola) {
  return null;
  }

  public void trimiteCerere(String username, String parola) {
  }

  public void acceptaCerere(String username, String parola) {
  }

  public String trimiteMesaj(String nume, String prenume, String mesaj) {
  return null;
  }

  public void publicaPostare(String newPost) {
  }

  public void reactPostare(String newReactie) {
  }

  public void commentPostare(String mesaj) {
  }

  public Pagina creeazaPagina(Pagina newPage) {
  return null;
  }

  public void apreciazaPagina(Pagina page) {
  }

}
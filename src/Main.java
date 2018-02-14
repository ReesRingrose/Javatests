import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



    }

   public static class Tune
    {
        int x;
        String title,altTitle,notation;


        void ToString()
        {


        }
    }

    public static class TuneBook
    {
        ArrayList<String> Tunes = new ArrayList<String>();



         public void TuneBooks()
        {
            BufferedReader inputStream = null;
            try {
                inputStream = new BufferedReader(new FileReader("hnj0.abc.txt"));

                String l;
                while ((l = inputStream.readLine()) != null)
                {
                    Tunes.add(l);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (inputStream != null) {
                    try
                    {
                        inputStream.close();
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}

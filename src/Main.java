import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();

    }

   public static class Tune
    {
        int x;
        String title,altTitle,notation;


        void ToString()
        {


        }

        public void play() {
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


        public String ToString()
        {
            int i=Tunes.length;
            while(i!=0)
            {
                return Tunes(i);

                i--;

            }

        }

    }
}

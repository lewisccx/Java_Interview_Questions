package threading.sync;

import java.io.*;
import java.util.*;

public class BlockSyncExample {
    public static void main (String[] args)
    {
        Geek gk = new Geek();
        List<String> list = new ArrayList<String>();
        gk.geekName("mohit", list);
        System.out.println(gk.name);

    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class File {
    private  String filename;

    public String getFilename() {
        return filename;
    }

    public File(String filename) {
        this.filename = filename;
    }
    public File(File filename) {
        this.filename = filename.filename;
    }

    public void setFilename(String filename) {
        setFilename(filename);
    }
    public void save(Human[] group/*, String filename*/)throws IOException
    {
        java.io.File file = new java.io.File(filename);
        System.out.println(file.getAbsoluteFile());
        file.delete();
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        for(int i = 0 ; i < group.length; i++)
        {
            writer.write(((Object)group[i]).getClass().getSimpleName() + ":\t" + group[i].toString() + ";");
            writer.write('\n');
        }
        writer.close(); //Потоки обязательно нужно закрывать
        String command = "notepad " + filename;
        Process process = Runtime.getRuntime().exec(command);
    }
    // Метод load

    public Human [] load (/*String filename*/) throws IOException {
        ArrayList<Human> al_group = new ArrayList<>();
        Human[] group = new Human[al_group.size()];
        java.io.File file = new java.io.File(filename);
        Scanner scanner = new Scanner(file);
        //int i = 1;
        while (scanner.hasNextLine()) {
            String buffer = scanner.nextLine();
            buffer = buffer.replaceAll(" ", "");
            buffer = buffer.replaceAll(";", "");
            System.out.println(buffer);

            String[] values = buffer.split("[:,;]");

            //Human member = HumanFactory.create(values[0]);
            //member.init(values);
            // System.out.println(member);
            //System.out.println(((Object)member).getClass().getSimpleName());
            //System.out.println(buffer);
            //for (String str : values) System.out.print(str);
            //
            al_group.add(HumanFactory.create(values[0]));
            al_group.get(al_group.size() - 1).init(values);
        }
        scanner.close();
        return al_group.toArray(group);
    }
}

package Problems;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class CodeTest {
    public static String solution(String s) {
        String lines[] = s.split(System.lineSeparator());
        int musicSize = 0;
        int imageSize = 0;
        int movieSize = 0;
        int otherSize = 0;
        for(String line : lines) {
            String elements[] = line.split(" ");
            String type = elements[0].split("\\.")[elements[0].split("\\.").length - 1];
            int size = Integer.parseInt(elements[1].replace("b",""));
            if (type.equals("mp3") || type.equals("aac") || type.equals("flac")) {
                musicSize += size;
            } else if (type.equals("jpg") || type.equals("bmp") || type.equals("gif")) {
                imageSize += size;
            } else if (type.equals("mp4") || type.equals("avi") || type.equals("mkv")) {
                movieSize += size;
            } else {
                otherSize += size;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append("music " + musicSize + "b" + System.lineSeparator());
        answer.append("image " + imageSize + "b" + System.lineSeparator());
        answer.append("movie " + movieSize + "b" + System.lineSeparator());
        answer.append("other " + otherSize + "b");

        return answer.toString();
    }

    public static void main(String[] args) {
        StringBuilder input = new StringBuilder();
        input.append("my.song.mp3 123b" + System.lineSeparator());
        input.append("greatSong.flac 13152b" + System.lineSeparator());
        input.append("not3.txt 13b" + System.lineSeparator());
        input.append("video.mp4 61323b" + System.lineSeparator());
        input.append("mov!e.mkv 152b");
        System.out.println(solution(input.toString()));
    }
}

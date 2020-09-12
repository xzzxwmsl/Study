package chapter_12.FileStudy;

import java.util.ArrayList;
import java.util.Scanner;


public class WebCrawler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input url");
        String url = scanner.nextLine();
        crawler(url);
    }

    public static void crawler(String startingURL) {
        // 待访问URL
        ArrayList<String> listOfPendiURLs = new ArrayList<>();
        // 浏览过的URL
        ArrayList<String> listOfTravelURLs = new ArrayList<>();
        // add startingURL to 待浏览URL
        listOfPendiURLs.add(startingURL);

        while (!listOfPendiURLs.isEmpty() && listOfPendiURLs.size() < 10) {
            String urlString = listOfPendiURLs.remove(0);
            // 未访问过
            if (!listOfTravelURLs.contains(urlString)) {
                listOfTravelURLs.add(urlString);
                System.out.printf("正在访问 %s ", urlString);

                // 获取子节点
                for (String s : getSubURL(urlString)) {
                    if (!listOfTravelURLs.contains(s)) {
                        listOfPendiURLs.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURL(String urlString) {
        System.out.println("--------------");
        ArrayList<String> list = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                // System.out.println(line);
                current = line.indexOf("http:", current);

                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                    // System.out.printf("current %d endIndex %d", current,endIndex);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error : " + ex);
        }
        return list;
    }
}

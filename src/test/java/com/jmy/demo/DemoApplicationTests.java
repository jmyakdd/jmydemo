package com.jmy.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private String content = " <Button Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"A1\" Grid.Column=\"1\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[0]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A2-A3\" Grid.Column=\"2\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[1]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A4-A5\" Grid.Column=\"3\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[2]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A6-A7\" Grid.Column=\"4\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[3]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\"  Content=\"A8-A9\" Grid.Column=\"5\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[4]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"A10-A11\" Grid.Column=\"6\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[5]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A12-A13\" Grid.Column=\"7\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[6]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A14-A15\" Grid.Column=\"8\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[7]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"A16-A17\" Grid.Column=\"9\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[8]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A18-A19\" Grid.Column=\"10\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[9]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A20-A21\" Grid.Column=\"11\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[10]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"A22-A23\" Grid.Column=\"12\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[11]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"A24\" Grid.Column=\"13\" Grid.Row=\"3\" DataContext=\"{Binding Path=WorkerList[12]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B1\" Grid.Column=\"1\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[13]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"B2-B3\" Grid.Column=\"2\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[14]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"B4-B5\" Grid.Column=\"3\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[15]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B6-B7\" Grid.Column=\"4\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[16]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"B8-B9\" Grid.Column=\"5\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[17]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"B10-B11\" Grid.Column=\"6\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[18]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B12-B13\" Grid.Column=\"7\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[19]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"B14-B15\" Grid.Column=\"8\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[20]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B16-B17\" Grid.Column=\"9\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[21]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B18-B19\" Grid.Column=\"10\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[22]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B20-B21\" Grid.Column=\"11\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[23]}\"></Button>\n" +
            "            <Button Margin=\"3\"  Template=\"{StaticResource ButtonTemplate}\" Content=\"B22-B23\" Grid.Column=\"12\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[24]}\"></Button>\n" +
            "            <Button  Margin=\"3\" Template=\"{StaticResource ButtonTemplate}\" Content=\"B24\" Grid.Column=\"13\" Grid.Row=\"1\" DataContext=\"{Binding Path=WorkerList[25]}\"></Button>";
    @Test
    public void contextLoads() {
        int currentPosition = 0;
        int startPostion = 0;
        int endPosition = 0;
        String result = "";
        while (content.contains("Content=")) {
            currentPosition = content.indexOf("Content=");
            content = content.substring(currentPosition);
            startPostion = content.indexOf("\"");
            endPosition = content.indexOf("\"",startPostion+1);
            String txt = content.substring(startPostion+1,endPosition);
            content = content.substring(endPosition);
            result+="\""+txt+"\",";
        }
        System.out.println(result);
    }

}

import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing布局管理器2
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 14:33
 * Version(版本): 1.0
 * Description(描述)：
 * 网格布局管理器
 * GridLayout（网格布局管理器）为组件的放置位置提供了更大的灵活性。它将区域分割成行数（rows）和列数（columns）的网格状布局，
 * 组件按照由左至右、由上而下的次序排列填充到各个单元格中。
 * GridLayout 的构造方法如下。
 * GridLayout(int rows,int cols)：创建一个指定行（rows）和列（cols）的网格布局。布局中所有组件的大小一样，组件之间没有间隔。
 * GridLayout(int rows,int cols,int hgap,int vgap)：创建一个指定行（rows）和列（cols）的网格布局，
 * 并且可以指定组件之间横向（hgap）和纵向（vgap）的间隔，单位是像素。
 * GridLayout 布局管理器总是忽略组件的最佳大小，而是根据提供的行和列进行平分。该布局管理的所有单元格的宽度和高度都是一样的。
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        JPanel jPanel = new JPanel();
        //指定面板的布局为GridLayout，4行4列，间隙为5
        jPanel.setLayout(new GridLayout(4, 4, 5, 5));
        jPanel.add(new JButton("7"));    //添加按钮
        jPanel.add(new JButton("8"));
        jPanel.add(new JButton("9"));
        jPanel.add(new JButton("/"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));
        jPanel.add(new JButton("*"));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("-"));
        jPanel.add(new JButton("0"));
        jPanel.add(new JButton("."));
        jPanel.add(new JButton("="));
        jPanel.add(new JButton("+"));
        jFrame.add(jPanel);
        jFrame.setBounds(300, 200, 640, 480);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

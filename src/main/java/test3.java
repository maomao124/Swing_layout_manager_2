import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing布局管理器2
 * Package(包名): PACKAGE_NAME
 * Class(类名): test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/30
 * Time(创建时间)： 14:49
 * Version(版本): 1.0
 * Description(描述)：
 * 盒布局管理器
 * BoxLayout（盒布局管理器）通常和 Box 容器联合使用，Box 类有以下两个静态方法。
 * createHorizontalBox()：返回一个 Box 对象，它采用水平 BoxLayout，即 BoxLayout 沿着水平方向放置组件，让组件在容器内从左到右排列。
 * createVerticalBox()：返回一个 Box 对象，它采用垂直 BoxLayout，即 BoxLayout 沿着垂直方向放置组件，让组件在容器内从上到下进行排列。
 * Box类设置组件间隔的静态方法
 * 网格包布局	说明
 * static Component createHorizontalGlue()	创建一个不可见的、可以被水平拉伸和收缩的组件
 * static Component createVerticalGlue()	创建一个不可见的、可以被垂直拉伸和收缩的组件
 * static Component createHorizontalStrut(int width)	创建一个不可见的、固定宽度的组件
 * static Component createVerticalStrut(int height)	创建一个不可见的、固定高度的组件
 * static Component createRigidArea(Dimension d)	创建一个不可见的、总是具有指定大小的组件
 */

public class test3
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试3");
        Box box1 = Box.createHorizontalBox();    //创建横向Box容器
        Box box2 = Box.createVerticalBox();    //创建纵向Box容器
        jFrame.add(box1);    //将外层横向Box添加进窗体
        box1.add(Box.createVerticalStrut(200));    //添加高度为200的垂直框架
        box1.add(new JButton("西"));    //添加按钮1
        box1.add(Box.createHorizontalStrut(140));    //添加长度为140的水平框架
        box1.add(new JButton("东"));    //添加按钮2
        box1.add(Box.createHorizontalGlue());    //添加水平胶水
        box1.add(box2);    //添加嵌套的纵向Box容器
        //添加宽度为100，高度为20的固定区域
        box2.add(Box.createRigidArea(new Dimension(100, 20)));
        box2.add(new JButton("北"));    //添加按钮3
        box2.add(Box.createVerticalGlue());    //添加垂直组件
        box2.add(new JButton("南"));    //添加按钮4
        box2.add(Box.createVerticalStrut(40));    //添加长度为40的垂直框架
        //设置窗口的关闭动作、标题、大小位置以及可见性等
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100, 100, 400, 200);
        jFrame.setVisible(true);
    }
}

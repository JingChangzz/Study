package RealExam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZhangJing on 2017/3/25.
 */
public class Main {

    //输入的n
    int an=0;

    public void setAn(int an) {
        this.an = an;
    }
    //输入的k
    int ak=0;
    public void setAk(int ak) {
        this.ak = ak;
    }

    //将输入的数据存下来
    ArrayList<Integer> inputlist= new ArrayList<>();

    private ArrayList<Integer> getinputn(int input)
    {
        inputlist.add(input);

        return inputlist;

    }

    //单个数字的变换
    public int getnewnum(int a,int b)
    {
        int result= a+b;
        if (result<100)
        {
            result= result%100;
        }


        return result;

    }
    //整体数据的变换

    public ArrayList<Integer> resetlistalldata()
    {
        ArrayList<Integer> result= new ArrayList<>();

        for (int i=1;i<an+1;i++)
        {
            int newsingledata;
            if (i==an)
            {
                newsingledata= getnewnum(inputlist.get(i-1),inputlist.get(0));
            }else {
                newsingledata= getnewnum(inputlist.get(i-1),inputlist.get(i));
            }

            result.add(newsingledata);
        }

        return null;
    }

    //经过k次变换的结果，然后输出
    public void resetlistbyk()
    {
        ArrayList<Integer> finallresult= new ArrayList<>();

        for (int j=1;j<ak+1;ak++)
        {
            finallresult= resetlistalldata();
        }
        //输出

        for (int i = 0; i <  finallresult.size(); i++){
            System.out.println(finallresult.get(i));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main m = new Main();
        m.setAn(scanner.nextInt());
        m.setAk(scanner.nextInt());

        for (int i =0; i < m.an; i++){
            m.getinputn(scanner.nextInt());
        }

        m.resetlistbyk();

    }

}

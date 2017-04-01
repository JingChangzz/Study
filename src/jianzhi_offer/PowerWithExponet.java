package jianzhi_offer;

/**
 * Created by ZhangJing on 2017/3/16.
 *
 * base的exponent次方
 */
public class PowerWithExponet {

    public double Power(double base, int exponent) {
        double result = 0.0d;

        result = Math.pow(base, (double)exponent);

        return result;
    }
}

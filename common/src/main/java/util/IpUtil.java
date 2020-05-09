package util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:24 下午
 * @description:
 */
public class IpUtil {

    private static final String IPV6_LOCAL_IP_VALUE = "0:0:0:0:0:0:0:1";
    private static final String LOCAL_IP_VALUE = "127.0.0.1";

    private IpUtil() {
    }

    private static String ipV6ToV4(String ipV6) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(ipV6);
        if (IPV6_LOCAL_IP_VALUE.equals(address.getHostAddress())) {
            return LOCAL_IP_VALUE;
        }

        return InetAddress.getByAddress(
                Arrays.copyOfRange(address.getAddress(), 12, 16))
                .getHostAddress();
    }

    public static String getLocalIP() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip = null;
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                Enumeration inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses != null && inetAddresses.hasMoreElements()) {
                    ip = (InetAddress) inetAddresses.nextElement();
                    if (!ip.isLoopbackAddress() && ip.getHostAddress().indexOf(":") == -1) {
                        return ip.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
        }
        return "127";
    }

}
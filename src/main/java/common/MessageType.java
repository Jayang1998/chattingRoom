package common;

/**
 * 用于在客户端服务端通信中标记消息类型
 */
public interface MessageType {
    String message_login_success = "1";//表明是登陆成功
    String message_login_fail = "2";//表明登录失败
    String message_comm_mes = "3";//普通信息包
    String message_get_onLineFriend = "4";//要求在线好友的包
    String message_ret_onLineFriend = "5";//返回在线好友的包
}

package edu.csu.leetcode.utils;

public class ListNodeUtils {
    /**
     * 将 "[1,2,3,4,5]" 格式的字符串转换为链表，返回头节点 head
     *
     * @param str 输入的字符串，如 "[1,2,3,4,5]"
     * @return 链表的头节点 head
     * @throws IllegalArgumentException 如果输入字符串格式不正确
     */
    public static ListNode constructLinkedList(String str) {
        if (str == null || !str.startsWith("[") || !str.endsWith("]")) {
            throw new IllegalArgumentException("输入字符串格式不正确，应为类似 [1,2,3,4,5] 的格式");
        }

        // 去除首尾的方括号，并按逗号分割
        String content = str.substring(1, str.length() - 1);
        if (content.isEmpty()) {
            return null; // 空链表
        }

        String[] elements = content.split(",");
        ListNode dummy = new ListNode(); // 虚拟头节点
        ListNode current = dummy;

        for (String element : elements) {
            try {
                int val = Integer.parseInt(element.trim());
                current.next = new ListNode(val);
                current = current.next;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("无效的数字格式: " + element);
            }
        }

        return dummy.next; // 返回真正的头节点
    }

    /**
     * 将链表转换为 [1,2,3,4,5] 格式的字符串
     *
     * @param head 链表的头节点
     * @return 链表对应的字符串，如 "[1,2,3,4,5]"
     */
    public static String linkedListToString(ListNode head) {
        if (head == null) {
            return "[]"; // 空链表返回 "[]"
        }

        StringBuilder sb = new StringBuilder("[");
        ListNode current = head;

        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(","); // 如果不是最后一个节点，加逗号
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }


    /**
     * 打印链表（用于测试）
     *
     * @param head 链表的头节点
     */
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
package com.stonebridge.mybatis.domian;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_id
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.order_name
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    private String orderName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.customer_id
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    private Integer customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_id
     *
     * @return the value of t_order.order_id
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_id
     *
     * @param orderId the value for t_order.order_id
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.order_name
     *
     * @return the value of t_order.order_name
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.order_name
     *
     * @param orderName the value for t_order.order_name
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.customer_id
     *
     * @return the value of t_order.customer_id
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.customer_id
     *
     * @param customerId the value for t_order.customer_id
     *
     * @mbggenerated Wed Nov 03 23:02:35 CST 2021
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
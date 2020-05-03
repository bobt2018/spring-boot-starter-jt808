/*
 *  Copyright (c) 2020. 衷于栖 All rights reserved.
 *
 *  版权所有 衷于栖 并保留所有权利 2020。
 *  ============================================================================
 *  这不是一个自由软件！您只能在不用于商业目的的前提下对程序代码进行修改和
 *  使用。不允许对程序代码以任何形式任何目的的再发布。如果项目发布携带作者
 *  认可的特殊 LICENSE 则按照 LICENSE 执行，废除上面内容。请保留原作者信息。
 *  ============================================================================
 *  作者：衷于栖（feedback@zhoyq.com）
 *  博客：https://www.zhoyq.com
 *  创建时间：2020
 *
 */

package com.zhoyq.server.jt808.starter.dto;

/**
 * @author zhoyq
 * @date 2018-06-27
 */
public class StoredMediaDataUpload {
    private byte type;
    private byte routeId;
    private byte eventCode;
    private byte[] beginTime;
    private byte[] endTime;
    private byte delSign;
    public byte getType() {
        return type;
    }
    public void setType(byte type) {
        this.type = type;
    }
    public byte getRouteId() {
        return routeId;
    }
    public void setRouteId(byte routeId) {
        this.routeId = routeId;
    }
    public byte getEventCode() {
        return eventCode;
    }
    public void setEventCode(byte eventCode) {
        this.eventCode = eventCode;
    }
    public byte[] getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(byte[] beginTime) {
        this.beginTime = beginTime;
    }
    public byte[] getEndTime() {
        return endTime;
    }
    public void setEndTime(byte[] endTime) {
        this.endTime = endTime;
    }
    public byte getDelSign() {
        return delSign;
    }
    public void setDelSign(byte delSign) {
        this.delSign = delSign;
    }

}
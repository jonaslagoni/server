/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.ace.library.tcp;

/**
 *
 * @author Lagoni
 */
public enum TcpRecieveTypes {
    MOVE(1);
    private final int typeValue;

    TcpRecieveTypes(int type) {
        this.typeValue = type;
    }

    /**
     * @return the typeValue
     */
    public int getTypeValue() {
        return typeValue;
    }

    public static TcpRecieveTypes fromInt(int typeValue) {
        for (TcpRecieveTypes typeEnum : TcpRecieveTypes.values()) {
            if (typeEnum.typeValue == typeValue) {
                return typeEnum;
            }
        }
        return null;
    }

    public String toString() {
        return "type_value:" + this.typeValue;
    }

}

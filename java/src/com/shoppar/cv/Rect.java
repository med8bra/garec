/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shoppar.cv;

public class Rect {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Rect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Rect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ShopparJNI.delete_Rect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(int value) {
    ShopparJNI.Rect_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return ShopparJNI.Rect_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    ShopparJNI.Rect_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return ShopparJNI.Rect_y_get(swigCPtr, this);
  }

  public void setWidth(int value) {
    ShopparJNI.Rect_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return ShopparJNI.Rect_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    ShopparJNI.Rect_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return ShopparJNI.Rect_height_get(swigCPtr, this);
  }

  public Rect(int _x, int _y, int _w, int _h) {
    this(ShopparJNI.new_Rect(_x, _y, _w, _h), true);
  }

}

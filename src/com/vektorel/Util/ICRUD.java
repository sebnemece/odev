package com.vektorel.Util;

import java.util.List;

public interface ICRUD<T> {

	public void Kaydet(T t);
 
    public void Sil(int id,T t);
    
    public List<T> Listele(T t);
    
}

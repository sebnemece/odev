package com.vektorel.Util;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VeritabaniIsletimcisi<T> implements ICRUD<T> {

	 private Session ss;
	 private Transaction tt;
	    
	 private void baglantiyiAc(){
	        ss = NewHibernateUtil.getSessionFactory().openSession();
	        tt = ss.beginTransaction();
	    }    
	    
	    private void baglantiyiSonlandir(){
	        tt.commit();
	        ss.close();
	    }
	
	@Override
	public void Kaydet(T t) {
		 try{
	            baglantiyiAc();
	            ss.save(t);
	            baglantiyiSonlandir();            
	        }
		 catch(Exception ex){}
	}

	@Override
	public void Sil(int id, T t) {
		try{
	        baglantiyiAc();
	        ss.delete(t);
	        baglantiyiSonlandir();
	        }
		catch(Exception ex){}
	}

	@Override
	public List<T> Listele(T t) {
		List<T> returnlist=null;
        try{
            baglantiyiAc();
            Criteria cr = ss.createCriteria(t.getClass());
            returnlist = cr.list();
            baglantiyiSonlandir();
        }
        catch(Exception ex){}
        //try-> return ss.createCriteria(t.getClass()).list();
        //catch-> return null;
        return returnlist;
	}

}

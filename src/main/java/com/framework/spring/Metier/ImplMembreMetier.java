package com.framework.spring.Metier;

import java.security.MessageDigest;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.framework.spring.Dao.MembreDao;
import com.framework.spring.entites.Membre;

@Transactional
public class ImplMembreMetier implements MembreMetier{
	
	 private MembreDao membreDao ;
	 
		public void setMembreDao(MembreDao membreDao) {
		this.membreDao = membreDao;
	}
		@Override
		public Membre addMembre(Membre membre) {
		
		
			if (membre.getPassword()==null ) return null;
			membre.setPassword(getSHA256(membre.getPassword()) ); 
			return membreDao.addMembre(membre);
		}

		
		@Override
		public Membre deleteMembre(int idMembre) {
			return membreDao.deleteMembre(idMembre);
			
		}
		
		@Override
		public Membre updateMembre(Membre membre) {
			membre.setPassword(getSHA256(membre.getPassword())); 
			return membreDao.updateMembre(membre);
		}
		
		@Override
		public List<Membre> allMembres() {
			// TODO Auto-generated method stub
			return membreDao.allMembres();
		}
		
		@Override
		public Membre findMembre(int idMembre) {
			Membre membre=membreDao.findMembre(idMembre);
			return membre;
		}
		@Override
		public Membre membreExists(String email, String password) {
			if(password== null || email == null) return null;
			password = getSHA256(password); 
			return membreDao.membreExists( email,  password);
		}
		
		
		
		
		
		
		
		
		
		
		
		public static String getSHA256(String data){
		    StringBuffer sb = new StringBuffer();
		    try{
		        MessageDigest md = MessageDigest.getInstance("SHA-256");
		        md.update(data.getBytes());
		        byte byteData[] = md.digest();

		        for (int i = 0; i < byteData.length; i++) {
		         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		        }
		    } catch(Exception e){
		        e.printStackTrace();
		    }
		    return sb.toString();
		}
}

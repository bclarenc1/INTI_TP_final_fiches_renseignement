package com.infotel.fiches;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.infotel.fiches.dao.CentreLoisirRepository;
import com.infotel.fiches.dao.ClubRepository;
import com.infotel.fiches.dao.EcoleRepository;
import com.infotel.fiches.dao.EnfantRepository;
import com.infotel.fiches.dao.FamilleRepository;
import com.infotel.fiches.dao.FimageRepository;
import com.infotel.fiches.dao.FmedicaleRepository;
import com.infotel.fiches.dao.FprincipaleRepository;
import com.infotel.fiches.dao.FvaccinationRepository;
import com.infotel.fiches.dao.LoginRepository;
import com.infotel.fiches.dao.RespLegalRepository;
import com.infotel.fiches.metier.CentreLoisir;
import com.infotel.fiches.metier.Club;
import com.infotel.fiches.metier.Ecole;
import com.infotel.fiches.metier.Enfant;
import com.infotel.fiches.metier.Famille;
import com.infotel.fiches.metier.Fimage;
import com.infotel.fiches.metier.Fmedicale;
import com.infotel.fiches.metier.Fprincipale;
import com.infotel.fiches.metier.Fvaccination;
import com.infotel.fiches.metier.Login;
import com.infotel.fiches.metier.RespLegal;

@SpringBootApplication
public class FichesDeRenseignementApplication {

	public static void main(String[] args) throws ParseException {
	ApplicationContext ctx = SpringApplication.run(FichesDeRenseignementApplication.class, args);
		
	CentreLoisirRepository dao =ctx.getBean(CentreLoisirRepository.class);
	dao.save(new CentreLoisir());
		

	ClubRepository dao2=ctx.getBean(ClubRepository.class);
	dao2.save(new Club());
	
	
    EcoleRepository dao3=ctx.getBean(EcoleRepository.class);
    dao3.save(new Ecole());
	
	
	EnfantRepository dao4=ctx.getBean(EnfantRepository.class);
	dao4.save(new Enfant());
	
	
	FamilleRepository dao5=ctx.getBean(FamilleRepository.class);
    dao5.save(new Famille("Bruneau",null));
  
	
	FimageRepository dao6=ctx.getBean(FimageRepository.class);
	dao6.save(new Fimage());
		
		
	FmedicaleRepository dao7=ctx.getBean(FmedicaleRepository.class);
	dao7.save(new Fmedicale());
	
	
	FprincipaleRepository dao8=ctx.getBean(FprincipaleRepository.class);
	dao8.save(new Fprincipale());
	
	
	FvaccinationRepository dao9=ctx.getBean(FvaccinationRepository.class);
	dao9.save(new Fvaccination());
	
	
	LoginRepository dao10=ctx.getBean(LoginRepository.class);
	dao10.save(new Login());
	
	
	RespLegalRepository dao11=ctx.getBean(RespLegalRepository.class);
	dao11.save(new RespLegal());
	}

}


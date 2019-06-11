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
		System.out.println("sloubi 1");
		CentreLoisirRepository dao01 = ctx.getBean(CentreLoisirRepository.class);
		dao01.save(new CentreLoisir(55));
		dao01.save(new CentreLoisir(20));

		ClubRepository dao02 = ctx.getBean(ClubRepository.class);
		System.out.println("sloubi 4");
		dao02.save(new Club("Go"));
		dao02.save(new Club("Aquaponey"));
		dao02.save(new Club("Sieste"));

		EcoleRepository dao03 = ctx.getBean(EcoleRepository.class);
		System.out.println("sloubi 7");
		dao03.save(new Ecole(420));
		dao03.save(new Ecole(69));
		dao03.save(new Ecole(314));

		EnfantRepository dao04 = ctx.getBean(EnfantRepository.class);
		System.out.println("sloubi 8");
		dao04.save(new Enfant("Eddy","Malou",42));
		dao04.save(new Enfant("Eddy","Mitchel",69));
		dao04.save(new Enfant("Eddy","Torial",1));

		FamilleRepository dao05 = ctx.getBean(FamilleRepository.class);
		System.out.println("sloubi 10");
		dao05.save(new Famille());
		dao05.save(new Famille("Ducon",null));

		FimageRepository dao06 = ctx.getBean(FimageRepository.class);
		System.out.println("sloubi 12");
		dao06.save(new Fimage());
		dao06.save(new Fimage(true));
		dao06.save(new Fimage(false));

		FmedicaleRepository dao07 = ctx.getBean(FmedicaleRepository.class);
		System.out.println("sloubi 15");
		dao07.save(new Fmedicale());
		dao07.save(new Fmedicale("none","none"));
		dao07.save(new Fmedicale("pollen","ablation des 3 mains"));

		FprincipaleRepository dao08 = ctx.getBean(FprincipaleRepository.class);
		System.out.println("sloubi 18");
		dao08.save(new Fprincipale());
		dao08.save(new Fprincipale("1 rue haute, 99998 Laville","0102030405"));
		dao08.save(new Fprincipale("Pont de l'Alma, niveau 0, 75008 Paris","N/A"));

		FvaccinationRepository dao09 = ctx.getBean(FvaccinationRepository.class);
		System.out.println("sloubi 21");
		dao09.save(new Fvaccination());
		dao09.save(new Fvaccination(true));
		dao09.save(new Fvaccination(false));

		LoginRepository dao10 = ctx.getBean(LoginRepository.class);
		System.out.println("sloubi 24");
		dao10.save(new Login());
		dao10.save(new Login("Coco","Lasticot"));
		dao10.save(new Login("xXx_PussySl4y3r_xXx","licky",null,null));

		RespLegalRepository dao11 = ctx.getBean(RespLegalRepository.class);
		System.out.println("sloubi 28");
		dao11.save(new RespLegal());
		dao11.save(new RespLegal("Hubert","Delafoune"));
		dao11.save(new RespLegal("Arnold","Scwhazhamburger",null,null));
	}

}

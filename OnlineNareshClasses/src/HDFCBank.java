class RBIBank{

	int roi,ifsccode;
}


class HDFCBank extends RBIBank{
	
	int  getrateofinterest(){
		roi=8;
	   return roi;
	}
	
	int  getifsccode(){
		ifsccode=1234;
		   return ifsccode;
		}
		
}



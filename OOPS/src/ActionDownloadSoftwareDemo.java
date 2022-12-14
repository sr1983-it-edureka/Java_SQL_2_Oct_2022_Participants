
public class ActionDownloadSoftwareDemo {

	class Mobile {
		
		void downloadSoftware(String softwareName, 
				String softwareVersion, Playstore anyPlaystore) {
			
		}
		
		void downloadSoftware(MobileApplication mobileApp,
				Playstore anyPlaystore) {
			
		}
	}
	
	class Playstore {
		
	}
	
	class MobileApplication{
		
	}
	
	public static void main(String[] args) {
				
		// Action
			// Download Telegram app on the john-mobile, where the version 12.1
			// from Google Play store
		
		
		//Objects
		/* john's mobile
		 * telegramApp
		 * googlePlaystore
		 */
		
		/*Classes / Category / Type / CustomType
		 * Mobile [john-mobile, etc..]
		 * Application, MobileApplication [telegram, whatsapp, facebook, etc..)
		 * Playstore (googleplaystore, samsungplaystore, etc...)
		 */
			
	
		//Action name
			// downloadSoftware
		
		// Primary Object
			// john'sMobile
		
		// Dependent Elements
		// What all elements have to be present for the action to be performed
			// Dependent Element 1 - softwareVersion
			// Dependent Element 2 -
								// softwareName
			// Depenent Element 3 - source 
								// googlePlaystore 
		
		Mobile johnMobile = null;
		
		Playstore googlePlaystore = null;
		
		johnMobile.downloadSoftware("Telegram", "12.1", googlePlaystore);
		
		MobileApplication telegramv12 = null;
		MobileApplication whatsappBusiness = null;
		MobileApplication gmailMobileApp = null;
		
		johnMobile.downloadSoftware(telegramv12, googlePlaystore);
		
		
	}
}

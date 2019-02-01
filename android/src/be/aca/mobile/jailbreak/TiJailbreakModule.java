package be.aca.mobile.jailbreak;

import com.scottyab.rootbeer.RootBeer;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.TiConfig;

@Kroll.module(name="TitaniumJailbreak", id="be.aca.mobile.jailbreak")
public class TiJailbreakModule extends KrollModule {

	private static RootBeer rootBeer;

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		rootBeer = new RootBeer(app);
	}

	// Methods
	@Kroll.method
	public boolean isJailbroken() {
		return rootBeer.isRootedWithoutBusyBoxCheck();
	}
}
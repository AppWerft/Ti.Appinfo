/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.appinfo;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(parentModule = AppinfoModule.class)
public class FilesystemModule extends AppinfoModule {

	@Kroll.constant
	public static final String TEST = "malprobieren";

	private static final String LCAT = "AppInfo";
	private static SimpleDateFormat sdf = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss,SSS", Locale.US);

	public FilesystemModule() {
		super();

	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}

	@Kroll.method
	public String getBackupAgentName() {
		KrollDict appinfo = AppinfoModule.init();
		if (appinfo == null)
			return null;
		return appinfo.getKrollDict("appinfo").getString("backupAgentName");
	}

	@Kroll.method
	public String getDataDir() {
		KrollDict appinfo = AppinfoModule.getAppInfo();
		return appinfo.getString("dataDir");
	}

	@Kroll.method
	public KrollDict getAll() {
		KrollDict appinfo = AppinfoModule.getAppInfo();
		return appinfo;
	}

	@Kroll.method
	public String getNativeLibraryDir() {
		KrollDict appinfo = AppinfoModule.getAppInfo();
		return appinfo.getKrollDict("appinfo").getString("nativeLibraryDir");
	}

	@Kroll.method
	public String getSharedLibraryFiles() {
		KrollDict appinfo = AppinfoModule.getAppInfo();
		return appinfo.getKrollDict("appinfo").getString("sharedLibraryFiles");
	}

	@Kroll.method
	public String getName() {
		KrollDict appinfo = AppinfoModule.getAppInfo();
		return appinfo.getString("name");
	}

	@Kroll.method
	public int getVersionsCode() {
		KrollDict appinfo = AppinfoModule.init();
		if (appinfo == null)
			return 0;
		return appinfo.getInt("versionsCode");
	}

	private static String time2date(long time) {
		GregorianCalendar calendar = new GregorianCalendar(
				TimeZone.getTimeZone("US/Central"));
		calendar.setTimeInMillis(time);
		return sdf.format(calendar.getTime());
	}

}

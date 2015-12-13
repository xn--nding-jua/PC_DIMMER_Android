package de.phoenixstudios.pc_dimmer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CollectionPagerAdapter extends FragmentStatePagerAdapter {
    public CollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment;

        switch(i) {
            case 1:
                fragment = Controlpanel.newInstance();
                return fragment;
            case 2:
                fragment = Scenes.newInstance();
                return fragment;
            case 3:
                fragment = Devicecontrol.newInstance();
                return fragment;
            case 4:
                fragment = Channeloverview.newInstance();
                return fragment;
            case 5:
                fragment = Stageview.newInstance();
                return fragment;
            case 6:
                fragment = About.newInstance();
                return fragment;
            default:
                fragment = Setup.newInstance("", "");
                return fragment;
        }
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 1:
                return "Kontrollpanel";
            case 2:
                return "Szenen";
            case 3:
                return "Gerätesteuerung";
            case 4:
                return "Kanalübersicht";
            case 5:
                return "Bühnenansicht";
            case 6:
                return "Info";
            default:
                return "Einstellungen";
        }
    }
}

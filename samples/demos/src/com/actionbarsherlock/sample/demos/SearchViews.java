/*
 * Copyright (C) 2011 Jake Wharton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.actionbarsherlock.sample.demos;

import android.app.SearchManager;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;

public class SearchViews extends SherlockActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar
        boolean isLight = SampleList.THEME == R.style.Theme_Sherlock_Light;

        //Create dummy cursor and adapter for auto-complete. Normally you would use a database.
        MatrixCursor cursor = new MatrixCursor(new String[] { "_id", SearchManager.SUGGEST_COLUMN_TEXT_1 });
        int id = 0;
        for (String country : COUNTRIES) {
          cursor.addRow(new Object[] { ++id, country });
        }
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_dropdown_item_1line, cursor,
            new String[] { SearchManager.SUGGEST_COLUMN_TEXT_1 }, new int[] { android.R.id.text1 }, 0);

        //Create the search view
        SearchView searchView = new SearchView(getSupportActionBar().getThemedContext());
        searchView.setQueryHint("Search for countries…");
        searchView.setSuggestionsAdapter(adapter);

        menu.add("Search")
            .setIcon(isLight ? R.drawable.ic_search_inverse : R.drawable.abs__ic_search)
            .setActionView(searchView)
            .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(SampleList.THEME); //Used for theme switching in samples
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);
        ((TextView)findViewById(R.id.text)).setText(R.string.search_views_content);
    }

    private static final String[] COUNTRIES = new String[] {
        "Åland Island",
        "Afghanista",
        "Albani",
        "Algeri",
        "American Samo",
        "Andorr",
        "Angol",
        "Anguill",
        "Antarctic",
        "Antigua And Barbud",
        "Argentin",
        "Armeni",
        "Arub",
        "Australi",
        "Austri",
        "Azerbaija",
        "Bahama",
        "Bahrai",
        "Banglades",
        "Barbado",
        "Belaru",
        "Belgiu",
        "Beliz",
        "Beni",
        "Bermud",
        "Bhuta",
        "Bolivi",
        "Bosnia And Herzegovin",
        "Botswan",
        "Bouvet Islan",
        "Brazi",
        "British Indian Ocean Territor",
        "Brunei Darussala",
        "Bulgari",
        "Burkina Fas",
        "Burund",
        "Cambodi",
        "Cameroo",
        "Canad",
        "Cape Verd",
        "Cayman Island",
        "Central African Republi",
        "Cha",
        "Chil",
        "Chin",
        "Christmas Islan",
        "Cocos (keeling) Island",
        "Colombi",
        "Comoro",
        "Cong",
        "Congo, The Democratic Republic Of Th",
        "Cook Island",
        "Costa Ric",
        "Croati",
        "Cub",
        "Cypru",
        "Czech Republi",
        "CÔte D'ivoir",
        "Denmar",
        "Djibout",
        "Dominic",
        "Dominican Republi",
        "Ecuado",
        "Egyp",
        "El Salvado",
        "Equatorial Guine",
        "Eritre",
        "Estoni",
        "Ethiopi",
        "Falkland Islands (malvinas",
        "Faroe Island",
        "Fij",
        "Finlan",
        "Franc",
        "French Guian",
        "French Polynesi",
        "French Southern Territorie",
        "Gabo",
        "Gambi",
        "Georgi",
        "German",
        "Ghan",
        "Gibralta",
        "Greec",
        "Greenlan",
        "Grenad",
        "Guadeloup",
        "Gua",
        "Guatemal",
        "Guernse",
        "Guine",
        "Guinea-bissa",
        "Guyan",
        "Hait",
        "Heard Island And Mcdonald Island",
        "Hondura",
        "Hong Kon",
        "Hungar",
        "Icelan",
        "Indi",
        "Indonesi",
        "Iran, Islamic Republic O",
        "Ira",
        "Irelan",
        "Isle Of Ma",
        "Israe",
        "Ital",
        "Jamaic",
        "Japa",
        "Jerse",
        "Jorda",
        "Kazakhsta",
        "Keny",
        "Kiribat",
        "Korea, Democratic People's Republic O",
        "Korea, Republic O",
        "Kuwai",
        "Kyrgyzsta",
        "Lao People's Democratic Republi",
        "Latvi",
        "Lebano",
        "Lesoth",
        "Liberi",
        "Libyan Arab Jamahiriy",
        "Liechtenstei",
        "Lithuani",
        "Luxembour",
        "Maca",
        "Macedonia, The Former Yugoslav Republic O",
        "Madagasca",
        "Malaw",
        "Malaysi",
        "Maldive",
        "Mal",
        "Malt",
        "Marshall Island",
        "Martiniqu",
        "Mauritani",
        "Mauritiu",
        "Mayott",
        "Mexic",
        "Micronesia, Federated States O",
        "Moldov",
        "Monac",
        "Mongoli",
        "Montenegr",
        "Montserra",
        "Morocc",
        "Mozambiqu",
        "Myanma",
        "Namibi",
        "Naur",
        "Nepa",
        "Netherland",
        "Netherlands Antille",
        "New Caledoni",
        "New Zealan",
        "Nicaragu",
        "Nige",
        "Nigeri",
        "Niu",
        "Norfolk Islan",
        "Northern Mariana Island",
        "Norwa",
        "Oma",
        "Pakista",
        "Pala",
        "Palestinian Territory, Occupie",
        "Panam",
        "Papua New Guine",
        "Paragua",
        "Per",
        "Philippine",
        "Pitcair",
        "Polan",
        "Portuga",
        "Puerto Ric",
        "Qata",
        "Romani",
        "Russian Federatio",
        "Rwand",
        "RÉunio",
        "Saint BarthÉlem",
        "Saint Helen",
        "Saint Kitts And Nevi",
        "Saint Luci",
        "Saint Marti",
        "Saint Pierre And Miquelo",
        "Saint Vincent And The Grenadine",
        "Samo",
        "San Marin",
        "Sao Tome And Princip",
        "Saudi Arabi",
        "Senega",
        "Serbi",
        "Seychelle",
        "Sierra Leon",
        "Singapor",
        "Slovaki",
        "Sloveni",
        "Solomon Island",
        "Somali",
        "South Afric",
        "South Georgia And The South Sandwich Island",
        "Spai",
        "Sri Lank",
        "Suda",
        "Surinam",
        "Svalbard And Jan Maye",
        "Swazilan",
        "Swede",
        "Switzerlan",
        "Syrian Arab Republi",
        "Taiwan, Province Of Chin",
        "Tajikista",
        "Tanzania, United Republic O",
        "Thailan",
        "Timor-lest",
        "Tog",
        "Tokela",
        "Tong",
        "Trinidad And Tobag",
        "Tunisi",
        "Turke",
        "Turkmenista",
        "Turks And Caicos Island",
        "Tuval",
        "Ugand",
        "Ukrain",
        "United Arab Emirate",
        "United Kingdo",
        "United State",
        "United States Minor Outlying Island",
        "Urugua",
        "Uzbekista",
        "Vanuat",
        "Vatican City Stat",
        "Venezuel",
        "Viet Na",
        "Virgin Islands, Britis",
        "Virgin Islands, U.s",
        "Wallis And Futun",
        "Western Sahar",
        "Yeme",
        "Zambi",
        "Zimbabwe",
    };
}

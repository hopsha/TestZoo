package com.by.siarheihopsha.testzoo.ui.activity;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.by.siarheihopsha.testzoo.R;
import com.by.siarheihopsha.testzoo.constants.Constants;
import com.by.siarheihopsha.testzoo.entity.Zoo;
import com.by.siarheihopsha.testzoo.entity.animals.Animal;
import com.by.siarheihopsha.testzoo.entity.animals.Cat;
import com.by.siarheihopsha.testzoo.entity.animals.Che;
import com.by.siarheihopsha.testzoo.entity.animals.Cow;
import com.by.siarheihopsha.testzoo.entity.animals.Dog;
import com.by.siarheihopsha.testzoo.entity.animals.Fox;
import com.by.siarheihopsha.testzoo.entity.animals.Hare;
import com.by.siarheihopsha.testzoo.entity.animals.Horse;
import com.by.siarheihopsha.testzoo.entity.animals.Wolf;
import com.by.siarheihopsha.testzoo.ui.fragment.AnimalFragment;
import com.by.siarheihopsha.testzoo.ui.fragment.ZooFragment;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements ControllerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            Zoo zoo = new Zoo();
            Cat cat1 = new Cat("белый", "молоко", "алексей", "лакаю");
            Cat cat2 = new Cat("серый", "молоко", "игорь", "лакаю");
            Cow cow1 = new Cow("рыжий", "траву", "ольга", "жую");
            Cow cow2 = new Cow("черный", "траву", "олеся", "щипаю");
            Dog dog1 = new Dog("белый", "кость", "петр", "грызу");
            Dog dog2 = new Dog("серый", "воду", "олег", "пью");
            Fox fox1 = new Fox("зайца", "екатерина", "жую");
            Fox fox2 = new Fox("мышь", "елизавета", "пережевываю");
            Hare hare1 = new Hare("морковь", "александр", "грызу");
            Hare hare2 = new Hare("яблоко", "михаил", "кусаю");
            Horse horse1 = new Horse("сивая", "сено", "полина", "жую");
            Wolf wolf = new Wolf("зайца", "евгений", "глотаю");
            Che chebur = new Che();

            zoo.add(cat1, cat2, cow1, cow2, dog1, dog2, fox1, fox2, hare1, hare2, horse1, wolf, chebur);
            this.startZooFragment(zoo.getAnimals());
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    private void startZooFragment(ArrayList<Animal> animals) {
        ZooFragment zooFragment = new ZooFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Constants.BUNDLE_ANIMALS, animals);
        zooFragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, zooFragment, Constants.FRAGMENT_TAG_ZOO);
        transaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    @Override
    public void showAnimalSpeech(String speech) {
        AnimalFragment animalFragment = new AnimalFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE_SPEECH, speech);
        animalFragment.setArguments(bundle);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, animalFragment, Constants.FRAGMENT_TAG_ANIMALS);
        transaction.addToBackStack(null);
        transaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }
}

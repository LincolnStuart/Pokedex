package co.lincolnstuart.pokedex.util;

import co.lincolnstuart.pokedex.R;

public class PokemonFlyingStrategy implements PokemonTypeStrategy {

    @Override
    public int getDrawableBackground() {
        return R.drawable.bg_circle_flying;
    }

    @Override
    public int getDrawableTypeIcon() {
        return R.drawable.ic_flying;
    }

    @Override
    public int getMainColor() {
        return R.color.icFlying;
    }

    @Override
    public int getSecondaryColor() {
        return R.color.bgFlying;
    }

}

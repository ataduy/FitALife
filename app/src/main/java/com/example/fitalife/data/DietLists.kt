package com.example.fitalife.data

import com.example.fitalife.R

data class DietLists(
    val id: String,
    val title: String,
    val description: String,
    val imageResource: Int // Drawable resource identifier
)

fun getDiets(): List<DietLists> {
    return listOf(
        DietLists(
            id = "1",
            title = "Keto",
            description = "Breakfast: Mushroom omelette with olive oil smoked turkey Avocado or olives\n" +
                    "Arugula, parsley, cucumber\n" +
                    "Lunch: Baked salmon,Green salad snack Walnuts or almonds\n" +
                    "Dinner: Grilled meat Boiled broccoli and cauliflower",
            imageResource = R.drawable.ic_keto
        ),
        DietLists(
            id = "2",
            title = "Paleo",
            description = "Breakfast: 2 eggs, tomato, cucumber, and 2 walnuts\n" +
                    "Snack: 10 hazelnuts and 2 dried apricots\n" +
                    "Lunch: 100-150 grams of boiled or grilled meat, fish or chicken, boiled vegetables, a salad with plenty of greens and 1 tablespoon of olive oil and lemon\n" +
                    "Snack: 1 portion of fruit and 2 walnuts\n" +
                    "Dinner: vegetable dish with olive oil and plenty of salad",
            imageResource = R.drawable.ic_paleo
        ),
        DietLists(
            id = "3",
            title = "Vegan",
            description = "Breakfast: coconut yogurt with berries, walnuts, and chia seeds\n" +
                    "Lunch: baked tofu with sautéed red cabbage, Brussels sprouts, and herbed couscous\n" +
                    "Dinner: mushroom lentil loaf with garlic cauliflower and Italian green beans",
            imageResource = R.drawable.ic_vegan
        ),
        DietLists(
            id = "4",
            title = "Raw",
            description = "Breakfast: Banana and Apple Oats Meal\n" +
                    "Mid-Meal: Tender Coconut Water\n" +
                    "Lunch: Cucumber Noodles with Peanut Sauce\n" +
                    "Evening: Sprouts\n" +
                    "Dinner: Cantalope n Strawberry Salad (1/2 cup)",
            imageResource = R.drawable.ic_raw_diet
        ),
        DietLists(
            id = "5",
            title = "Mediterranean",
            description = "Breakfast: Whole grain toast, fresh fruits, boiled eggs\n" +
                    "Lunch: Sandwich and hummus prepared with whole grain bread\n" +
                    "Dinner: A salad made with lettuce, tomato, celery, feta cheese and olive oil and vinegar dressing.\n" +
                    "Snacks: Watermelon or blueberries",
            imageResource = R.drawable.ic_mediterranean
        ),
        DietLists(
            id = "6",
            title = "No Sugar",
            description = "Breakfast: Scrambled eggs with spinach and tomatoes, with a small serving of plain Greek yogurt with a handful of fresh berries\n" +
                    "Lunch: Grilled chicken breast with a side salad (lettuce, cucumber, and bell peppers) dressed with olive oil and vinegar\n" +
                    "Dinner: Baked salmon with steamed broccoli and quinoa",
            imageResource = R.drawable.ic_no_sugar
        ),
        DietLists(
            id = "7",
            title = "Low Carb",
            description = "Breakfast: Omelet with various vegetables, fried in butter or coconut oil.\n" +
                    "Lunch: Grass-fed yogurt with blueberries and a handful of almonds.\n" +
                    "Dinner: Cheeseburger (no bun), served with vegetables and salsa sauce.",
            imageResource = R.drawable.ic_lowcarb
        ),
        DietLists(
            id = "8",
            title = "Vegetarian",
            description = "Breakfast: oatmeal with fruit, nut butter, flaxseed, and a glass of soy milk\n" +
                    "Lunch: grilled veggie and hummus wrap on a whole-grain tortilla with lentil salad\n" +
                    "Dinner: tofu banh mi sandwich with pickled slaw",
            imageResource = R.drawable.ic_vegan
        )


    )
}


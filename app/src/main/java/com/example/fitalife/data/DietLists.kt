package com.example.fitalife.data

import com.example.fitalife.R

data class DietLists(
    val id: String,
    val title: String,
    val description: String,
    val meals: List<String>,
    val imageResource: Int // Drawable resource identifier
)

fun getDiets(): List<DietLists> {
    return listOf(
        DietLists(
            id = "1",
            title = "Keto",
            description = "“Ketogenic” is a term for a low-carb diet (like the Atkins diet). " +
                    "The idea is for you to get more calories from protein and fat and less from " +
                    "carbohydrates. You cut back most on the carbs that are easy to digest, " +
                    "like sugar, soda, pastries, and white bread.",
            meals = listOf(
                "Monday - Breakfast: Avocado, kale, banana, and apple smoothie with almond milk. Lunch: Mixed salad leaves with fried seabass, pumpkin seeds, and an olive oil dressing. Dinner: Roast chicken with a stuffing of onion, carrots, and rosemary.",
                "Tuesday - Breakfast: Scrambled eggs with spinach and feta cheese. Lunch: Grilled salmon with asparagus and a side of avocado. Dinner: Beef steak with cauliflower rice and green beans.",
                "Wednesday - Breakfast: Greek yogurt with nuts and a sprinkle of cinnamon. Lunch: Chicken Caesar salad without croutons. Dinner: Pork chops with broccoli and a creamy mushroom sauce.",
                "Thursday - Breakfast: Omelette with mushrooms, bell peppers, and cheddar cheese. Lunch: Shrimp and avocado salad with a lemon vinaigrette. Dinner: Lamb chops with brussels sprouts and a side of garlic butter.",
                "Friday - Breakfast: Coconut milk chia pudding with mixed berries. Lunch: Turkey breast slices with cucumber and cream cheese rolls. Dinner: Grilled chicken thighs with zucchini noodles and pesto.",
                "Saturday - Breakfast: Almond flour pancakes with a berry compote. Lunch: Tuna salad with mixed greens, olives, and a mustard dressing. Dinner: Baked cod with a tomato and basil topping, served with eggplant.",
                "Sunday - Breakfast: Fried eggs with bacon and avocado. Lunch: Roast beef with a side of roasted cauliflower and radishes. Dinner: Grilled lamb burgers with a side of Greek salad."
            ),
            imageResource = R.drawable.ic_keto
        ),

        DietLists(
            id = "2",
            title = "Paleo",
            description = "The Paleo diet is based on eating foods presumed to be available to " +
                    "Paleolithic humans. It includes meats, fish, fruits, vegetables, " +
                    "nuts, and seeds. It limits foods that became common when farming emerged, " +
                    "like dairy, grains, and legumes.",
            meals = listOf(
                "Monday - Breakfast: Scrambled eggs with spinach. Lunch: Grilled chicken salad with olive oil dressing. Dinner: Beef stir-fry with a variety of vegetables.",
                "Tuesday - Breakfast: Banana and almond smoothie. Lunch: Baked salmon with avocado salad. Dinner: Pork chops with roasted sweet potatoes and green beans.",
                "Wednesday - Breakfast: Coconut yogurt with fresh berries. Lunch: Turkey lettuce wraps with cucumber and bell pepper. Dinner: Grilled shrimp with asparagus and tomato.",
                "Thursday - Breakfast: Omelette with mushrooms and tomatoes. Lunch: Chicken soup with vegetables. Dinner: Steak with a side of roasted carrots and broccoli.",
                "Friday - Breakfast: Fruit salad with nuts. Lunch: Tuna salad with mixed greens. Dinner: Lamb kebabs with bell peppers and onions.",
                "Saturday - Breakfast: Smoked salmon and avocado. Lunch: Beef and vegetable stew. Dinner: Chicken thighs with Brussels sprouts.",
                "Sunday - Breakfast: Bacon and eggs with a side of fruit. Lunch: Grilled fish with a salad. Dinner: Pork tenderloin with roasted butternut squash and green beans."
            ),
            imageResource = R.drawable.ic_paleo
        ),

        DietLists(
            id = "3",
            title = "Vegan",
            description = "The Vegan diet excludes all animal products, including meat, dairy, and " +
                    "eggs. It focuses on plant-based foods such as fruits, vegetables, legumes, " +
                    "nuts, seeds, and grains.",
            meals = listOf(
                "Monday - Breakfast: Oatmeal with almond milk, bananas, and walnuts. Lunch: Quinoa salad with black beans, corn, and avocado. Dinner: Vegan chili with kidney beans, tomatoes, and bell peppers.",
                "Tuesday - Breakfast: Smoothie with spinach, banana, and peanut butter. Lunch: Hummus and vegetable wrap. Dinner: Lentil soup with carrots, celery, and onions.",
                "Wednesday - Breakfast: Chia seed pudding with coconut milk and mixed berries. Lunch: Vegan sushi rolls with avocado, cucumber, and sweet potato. Dinner: Stuffed bell peppers with rice and black beans.",
                "Thursday - Breakfast: Avocado toast on whole grain bread. Lunch: Buddha bowl with roasted chickpeas, sweet potato, and kale. Dinner: Spaghetti with vegan meatballs and marinara sauce.",
                "Friday - Breakfast: Fruit salad with a sprinkle of flaxseeds. Lunch: Tomato and basil soup with a side of garlic bread. Dinner: Vegan pizza with a cauliflower crust and vegetable toppings.",
                "Saturday - Breakfast: Vegan pancakes with maple syrup and fresh fruit. Lunch: Falafel salad with tahini dressing. Dinner: Eggplant parmesan made with vegan cheese.",
                "Sunday - Breakfast: Tofu scramble with spinach and mushrooms. Lunch: Vegan Pad Thai with tofu and vegetables. Dinner: Mushroom risotto with peas and asparagus."
            ),
            imageResource = R.drawable.ic_vegan
        ),

        DietLists(
            id = "4",
            title = "No Sugar",
            description = "The No Sugar diet involves eliminating all forms of added sugars and sweeteners. This includes avoiding high-sugar foods and drinks, focusing on whole foods like vegetables, fruits, proteins, and whole grains.",
            meals = listOf(
                "Monday - Breakfast: Greek yogurt with nuts and berries. Lunch: Grilled chicken salad with olive oil and lemon dressing. Dinner: Baked salmon with steamed broccoli and quinoa.",
                "Tuesday - Breakfast: Omelette with spinach, tomatoes, and mushrooms. Lunch: Turkey and avocado wrap with whole grain tortilla. Dinner: Beef stir-fry with mixed vegetables.",
                "Wednesday - Breakfast: Cottage cheese with sliced strawberries. Lunch: Lentil soup with kale and carrots. Dinner: Grilled shrimp with a mixed green salad and vinaigrette.",
                "Thursday - Breakfast: Scrambled eggs with bell peppers and onions. Lunch: Quinoa salad with chickpeas, cucumber, and feta cheese. Dinner: Chicken breast with roasted Brussels sprouts and sweet potatoes.",
                "Friday - Breakfast: Smoothie with spinach, avocado, and unsweetened almond milk. Lunch: Tuna salad with mixed greens and olive oil dressing. Dinner: Pork chops with apple cider vinegar sauce and sautéed green beans.",
                "Saturday - Breakfast: Almond butter and banana on whole grain toast. Lunch: Grilled veggie burger with lettuce wrap. Dinner: Zucchini noodles with turkey meatballs and marinara sauce.",
                "Sunday - Breakfast: Poached eggs with avocado and tomato slices. Lunch: Grilled salmon with asparagus and a lemon wedge. Dinner: Slow-cooked beef stew with vegetables."
            ),
            imageResource = R.drawable.ic_no_sugar
        ),

        DietLists(
            id = "5",
            title = "Low Carb",
            description = "A Low Carb diet focuses on reducing carbohydrate intake, favoring proteins and fats, and including a variety of vegetables. It's similar to the ketogenic diet but with a bit more flexibility in carb intake.",
            meals = listOf(
                "Monday - Breakfast: Scrambled eggs with cheese and avocado. Lunch: Chicken Caesar salad without croutons. Dinner: Grilled salmon with a side of roasted cauliflower.",
                "Tuesday - Breakfast: Greek yogurt with a handful of raspberries. Lunch: Beef and vegetable stir-fry. Dinner: Baked chicken with green beans and almonds.",
                "Wednesday - Breakfast: Smoothie with spinach, protein powder, and coconut milk. Lunch: Tuna salad with celery and mayonnaise. Dinner: Pork loin with a side of sautéed kale.",
                "Thursday - Breakfast: Omelette with ham, cheese, and peppers. Lunch: Shrimp and avocado salad with a lime dressing. Dinner: Lamb chops with steamed asparagus.",
                "Friday - Breakfast: Cottage cheese with sliced cucumber and pepper. Lunch: Turkey and cheese roll-ups. Dinner: Grilled steak with a side of Brussels sprouts.",
                "Saturday - Breakfast: Almond flour pancakes with butter. Lunch: Chicken and avocado lettuce wraps. Dinner: Cod fillets with a tomato and olive tapenade.",
                "Sunday - Breakfast: Bacon and eggs. Lunch: Grilled chicken with mixed leaf salad. Dinner: Meatloaf with a side of mashed cauliflower."
            ),
            imageResource = R.drawable.ic_lowcarb
        ),

        DietLists(
            id = "6",
            title = "Vegetarian",
            description = "The Vegetarian diet excludes meat and focuses on plants for food. It includes fruits, vegetables, nuts, seeds, oils, whole grains, legumes, and beans, but may include dairy and eggs depending on the type.",
            meals = listOf(
                "Monday - Breakfast: Vegetable omelette with spinach and tomatoes. Lunch: Caprese salad with fresh mozzarella, tomatoes, and basil. Dinner: Vegetarian lasagna with spinach and ricotta.",
                "Tuesday - Breakfast: Oatmeal with almond milk, apple slices, and cinnamon. Lunch: Grilled cheese and tomato soup. Dinner: Stuffed bell peppers with rice, beans, and cheese.",
                "Wednesday - Breakfast: Yogurt parfait with granola and mixed berries. Lunch: Avocado and chickpea sandwich. Dinner: Eggplant parmigiana with a side of garlic bread.",
                "Thursday - Breakfast: Smoothie bowl with banana, berries, and chia seeds. Lunch: Quinoa salad with roasted vegetables. Dinner: Vegetarian curry with lentils and mixed vegetables.",
                "Friday - Breakfast: Bagel with cream cheese and smoked salmon. Lunch: Greek salad with feta cheese and olives. Dinner: Mushroom risotto.",
                "Saturday - Breakfast: Pancakes with maple syrup and fresh fruit. Lunch: Falafel wrap with tahini sauce. Dinner: Vegetarian chili with cornbread.",
                "Sunday - Breakfast: French toast with berries and honey. Lunch: Margherita pizza with a side salad. Dinner: Vegetable stir-fry with tofu and brown rice."
            ),
            imageResource = R.drawable.ig_vegetarian
        ),

                /*
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
                 */


    )
}


package com.example.fitalife.data

data class WorkoutsPrograms(
    val id: String,
    val title: String,
    val description: String,
    val videos: List<String>, // Videoların URLleri
)

fun getPrograms(): List<WorkoutsPrograms> {
    return listOf(
        WorkoutsPrograms(
            id = "1",
            title = "For Beginner Basic Workout:",
            description = "Squat: 3 sets x 12 reps\n" +
                    "Push-up: 3 sets x 10 reps\n" +
                    "Plank: 3 sets x 30 seconds\n" +
                    "Lunges: 3 sets x 12 reps (each leg)\n" +
                    "Dumbbell Rows: 3 sets x 10 reps (each arm)",
            videos = listOf(/* Video URLs or IDs */)
        ),
        WorkoutsPrograms(
            id = "2",
            title = "Strength Training for Muscle Gain:",
            description = "Deadlift: 4 sets x 8 reps\n" +
                    "Bench Press: 4 sets x 10 reps\n" +
                    "Barbell Squat: 4 sets x 12 reps\n" +
                    "Pull-ups: 3 sets x maximum reps\n" +
                    "Russian Twists: 3 sets x 20 reps (each side)",
            videos = listOf(/* Video URLs or IDs */)
        ),
        WorkoutsPrograms(
            id = "3",
            title = "Cardio and Endurance Training:",
            description = "Running: 20 minutes (adjust to your speed)\n" +
                    "Jumping Jacks: 3 sets x 1 minute\n" +
                    "Cycling: 15 minutes\n" +
                    "Mountain Climbers: 3 sets x 15 reps\n" +
                    "Plank to Push-up: 3 sets x 10 reps",
            videos = listOf(/* Video URLs or IDs */)
        ),
        WorkoutsPrograms(
            id = "4",
            title = "Yoga Training for Flexibility and Balance:",
            description = "Downward Dog: 3 sets x 30 seconds\n" +
                    "Warrior Pose: 2 sets x 45 seconds (each leg)\n" +
                    "Tree Pose: 3 sets x 30 seconds (each leg)\n" +
                    "Child's Pose: 2 sets x 1 minute\n" +
                    "Cobra Stretch: 3 sets x 30 seconds",
            videos = listOf(/* Video URLs or IDs */)
        ),
        WorkoutsPrograms(
            id = "5",
            title = "Fun Training for Sports and Games:",
            description = "Choose your favorite sport like football, basketball, tennis.\n" +
                    "A game or training session lasting 30 minutes.\n" +
                    "Stay continuously active and have fun.",
            videos = listOf(/* Video URLs or IDs */)
        ),
        WorkoutsPrograms(
            id = "6",
            title = "Intense Cardio Workout:",
            description = "HIIT (High-Intensity Interval Training): 30 seconds of work, 30 seconds of rest - Total 20 minutes\n" +
                    "Burpees: 3 sets x 15 reps\n" +
                    "Box Jumps: 3 sets x 12 reps\n" +
                    "High Knees: 3 sets x 1 minute",
            videos = listOf(/* Video URLs or IDs */)
        )
    )
}
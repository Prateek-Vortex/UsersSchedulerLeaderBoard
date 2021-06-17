# Scheduler and Leaderboard

We can enter marks of different subjects for the user and at each hour it will create the leaderboard in the database listing top 10 performers based on total marks. Follows 3-tier architecture.

# Endpoints:

## Post

/adda/add/marks: This end points takes UsersAddMarksModel and store the give marks in the database, return a String.

# Model:
## UserAddMarksModel:
{
    userId:String,
    firstName: String,
    aptitude:int,
    coding,int
}

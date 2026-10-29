import csv
from datetime import datetime

# File to store attendance
ATTENDANCE_FILE = "attendance.csv"

# Create CSV with headers if it doesn't exist
def initialize_file():
    try:
        with open(ATTENDANCE_FILE, "x", newline="") as f:
            writer = csv.writer(f)
            writer.writerow(["Student ID", "Name", "Date", "Time", "Status"])
    except FileExistsError:
        pass  # File already exists

# Mark attendance
def mark_attendance(student_id, name, status="Present"):
    now = datetime.now()
    date = now.strftime("%Y-%m-%d")
    time = now.strftime("%H:%M:%S")

    with open(ATTENDANCE_FILE, "a", newline="") as f:
        writer = csv.writer(f)
        writer.writerow([student_id, name, date, time, status])

    print(f"✅ Attendance marked for {name} ({student_id}) at {time} on {date}")

# Show attendance records
def view_attendance():
    try:
        with open(ATTENDANCE_FILE, "r") as f:
            reader = csv.reader(f)
            for row in reader:
                print(row)
    except FileNotFoundError:
        print("⚠ No attendance records found!")

# Simple Menu
def main():
    initialize_file()

    while True:
        print("\n===== Attendance System =====")
        print("1. Mark Attendance")
        print("2. View Attendance Records")
        print("3. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            sid = input("Enter Student ID: ")
            name = input("Enter Name: ")
            mark_attendance(sid, name)
        elif choice == "2":
            view_attendance()
        elif choice == "3":
            print("Exiting...")
            break
        else:
            print("❌ Invalid choice!")

if __name__ == "__main__":
    main()

# Hospital Management System

## Overview
The **Hospital Management System** is a web-based application designed to streamline hospital operations by managing doctors, patients, and appointments efficiently. The system allows administrators to perform CRUD operations on doctor records, while patients can self-register and book appointments with doctors.

## Features
- **Admin Features:**
  - Create, Read, Update, and Delete (CRUD) operations for doctors.
  - Manage hospital-related functionalities.
- **Doctor Features:**
  - View assigned patients and appointments.
  - Manage availability and schedules.
- **Patient Features:**
  - Self-registration.
  - Book appointments with available doctors.
  - View appointment history.

## Technologies Used
### Backend:
- Java (Spring Boot)
- Hibernate, Spring Data JPA
- Lombok
- RESTful API development
- MySQL/PostgreSQL (Database)

### Frontend:
- React.js (with Vite for development)
- React Router for navigation
- Axios for API communication
- React Hot Toast for notifications
- React Icons for UI elements

## Installation and Setup
### Prerequisites:
- Node.js (latest stable version)
- Java (JDK 17 or later)
- MySQL/PostgreSQL Database

### Steps to Run the Application:
1. Clone the repository:
   ```sh
   git clone https://github.com/poojak1515/Hospital-Managemnet-System.git
   ```
2. Navigate to the project directory:
   ```sh
   cd hospital-management
   ```
3. Install dependencies:
   ```sh
   npm install
   ```
4. Start the development server:
   ```sh
   npm run dev
   ```

## Project Structure
```
/hospital-management
│── src/
│   ├── components/    # Reusable React components
│   ├── pages/         # Main pages (Admin, Doctor, Patient, Appointment)
│   ├── services/      # API services using Axios
│   ├── context/       # Global state management (if any)
│   └── App.js         # Main entry point
│── public/            # Static assets
│── package.json       # Project dependencies and scripts
│── vite.config.js     # Vite configuration
│── README.md          # Project documentation
```

## Scripts
- **Development Server:** `npm run dev`
- **Build for Production:** `npm run build`
- **Lint Code:** `npm run lint`
- **Preview Production Build:** `npm run preview`

## Dependencies
```json
{
  "dependencies": {
    "axios": "^1.7.9",
    "react": "^19.0.0",
    "react-dom": "^19.0.0",
    "react-hot-toast": "^2.5.2",
    "react-icons": "^5.4.0",
    "react-router-dom": "^7.1.5"
  },
  "devDependencies": {
    "@vitejs/plugin-react": "^4.3.4",
    "eslint": "^9.19.0",
    "vite": "^6.1.0"
  }
}
```

## Developed By
**Pooja Kumari**

## License
This project is for learning purposes and does not have an open-source license yet.

---



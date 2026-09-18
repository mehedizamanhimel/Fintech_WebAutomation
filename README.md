# Fintech_WebAutomation

![Java](https://img.shields.io/badge/Java-11-blue) ![Selenium](https://img.shields.io/badge/Selenium-4.x-green) ![TestNG](https://img.shields.io/badge/TestNG-7.x-orange) ![Maven](https://img.shields.io/badge/Build-Maven-red)

A self-assignment web automation project targeting the **Oradian** fintech platform. Built using Selenium WebDriver and TestNG with Maven, following the Page Object Model pattern. Test data is managed through a centralized properties file.

---

## 🛠 Tech Stack

| Tool | Details |
|---|---|
| Java | 11 |
| Selenium WebDriver | 4.x |
| TestNG | 7.x |
| WebDriverManager | 5.x |
| Maven | 3.x |
| Pattern | Page Object Model |
| Test Data | Properties file (`util` package) |

---

## 📁 Project Structure

```
src/
├── main/java/
│   ├── page/instafin/      → Page classes with WebElements per page
│   └── util/               → Property file reader and test data helpers
├── test/java/
│   └── testsuites/instafin/ → Test execution classes
└── test/resources/
    └── config.properties
```

---

## ⚙️ Prerequisites

- Java JDK 11+
- Maven 3.x
- IDE: IntelliJ IDEA or Eclipse
- Chrome, Firefox, or Edge browser (WebDriverManager handles driver binaries automatically)

---

## ▶️ How to Run

### Via Command Line

```bash
# Clone the project
git clone https://github.com/mehedizamanhimel/Fintech_WebAutomation.git
cd Fintech_WebAutomation

# Run all tests
mvn clean test

# Run via TestNG XML
mvn test -DsuiteXmlFile=testng.xml
```

### Via IDE

1. Open the project by navigating to `pom.xml` in IntelliJ IDEA
2. Select **Open as Project** if prompted, and trust the project
3. Navigate to `testsuites/instafin/` and run any test class as a **TestNG Test**
4. Or right-click `testng.xml` → Run

---

## ✅ Test Coverage

- Login and authentication flows for the Oradian Instafin platform
- Navigation across core fintech dashboard sections
- Data entry and form validation
- Accessible via test suite classes under `testsuites/instafin/`

---

## 📊 Reports

After execution, TestNG reports are available at:

```
target/surefire-reports/
target/index.html
```

Open in any browser for detailed pass/fail results.

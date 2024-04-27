package com.Mafiuz04.medicalclinic;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    List<Patient> patients = new ArrayList<>();

    public void showAllPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void showPatientByEmail(String email) {
        patients.stream()
                .filter(patient -> patient.getEmail().equals(email))
                .findAny()
                .ifPresent(System.out::println);
    }

    public void addPatient(String email, String password, long idCardNo, String firstName, String lastName,
                           String phoneNumber, LocalDate birthday) {
        patients.add(new Patient(email, password, idCardNo, firstName, lastName, phoneNumber, birthday));
    }

    public void deletePatientByEmail(String email) {
        patients.removeIf(patient -> patient.getEmail().equals(email));
    }


    public void updatePatientByMail(String email, String password, long idCardNo, String firstName, String lastName,
                                    String phoneNumber, LocalDate birthday, String newEmail) {
        Patient patient = searchForAPatient(email);
        patient.setEmail(newEmail);
        patient.setPassword(password);
        patient.setIdCardNo(idCardNo);
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setPhoneNumber(phoneNumber);
        patient.setBirthday(birthday);
    }

    public void updatePatientByMail(String email, Patient updatedPatient) {
        Patient patient = searchForAPatient(email);
        patient.setEmail(updatedPatient.getEmail());
        patient.setPassword(updatedPatient.getPassword());
        patient.setIdCardNo(updatedPatient.getIdCardNo());
        patient.setFirstName(updatedPatient.getFirstName());
        patient.setLastName(updatedPatient.getLastName());
        patient.setPhoneNumber(updatedPatient.getPhoneNumber());
        patient.setBirthday(updatedPatient.getBirthday());
    }

    private Patient searchForAPatient(String email) {
        return patients.stream()
                .filter(patient -> patient.getEmail().equals(email))
                .findAny().get();
    }
}

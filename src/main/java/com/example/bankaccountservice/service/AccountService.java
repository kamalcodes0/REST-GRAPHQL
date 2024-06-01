package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);


    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}

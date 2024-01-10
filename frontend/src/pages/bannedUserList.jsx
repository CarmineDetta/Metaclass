
import React from 'react'
import {MyHeader} from "../components/Header/Header";
import {MyFooter} from "../components/Footer/Footer";
import BannedUserList from "../components/UserList/BannedUserList";

export const BannedList = ({List}) => {


    return(
        <>
            <header>
                <MyHeader/>
            </header>
            <section>
                <div className={'total-body'}>
                    <div>
                        <BannedUserList userList={List} />
                    </div>
                </div>
            </section>
            <footer>
                <MyFooter/>
            </footer>
        </>
    );
}
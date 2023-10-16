/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {SafeAreaView} from 'react-native';

import {MyView} from './JetpackComponent';

function App(): JSX.Element {
  return (
    <SafeAreaView>
      <MyView />
    </SafeAreaView>
  );
}

export default App;
